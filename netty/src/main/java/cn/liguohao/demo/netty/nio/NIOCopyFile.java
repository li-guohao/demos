package cn.liguohao.demo.netty.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * Java NIO Copy File
 *
 * @author <a href="mailto:liguohao_cn@qq.com">liguohao_cn@qq.com</a>
 * @since 2021/3/26
 */
public class NIOCopyFile {
    public static void main(String[] args) throws IOException {
        // 源路径和目标路径
        File srcFile = new File("D://test//nio/test.mp4");
        File targetFile = new File("D://test//nio/test-copy.mp4");

        // 源读取通道和目标写入通道
        FileChannel fileReadChannel = new FileInputStream(srcFile).getChannel();
        FileChannel fileWriteChannel = new FileOutputStream(targetFile).getChannel();

        // 拷贝数据
        long start = System.currentTimeMillis();
        fileWriteChannel.transferFrom(fileReadChannel, 0, fileReadChannel.size());
        long end = System.currentTimeMillis();
        System.out.println("文件拷贝完成 耗时 ==> " + (end - start) + "ms");

        // 释放资源
        fileWriteChannel.close();
        fileReadChannel.close();

    }
}
