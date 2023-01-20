package cn.liguohao.demo.netty.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Java NIO Read File
 *
 * @author <a href="mailto:liguohao_cn@qq.com">liguohao_cn@qq.com</a>
 * @since 2021/3/26
 */
public class NIOReadFile {
    public static void main(String[] args) throws IOException {

        // 目标文件位置
        File file = new File("D://test//nio//message.txt");

        // 构建文件读取通道
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel fileInputStreamChannel = fileInputStream.getChannel();

        // 构建文件读取缓存区
        ByteBuffer byteBuffer = ByteBuffer.allocate((int) file.length());

        // 将通道数据读取到缓存区
        while (true) {
            int read = fileInputStreamChannel.read(byteBuffer);
            if (read <= 0) {
                break;
            }
        }

        // 取出缓存区并打印到控制台
        byteBuffer.flip();
        byte[] contentBytes = new byte[byteBuffer.limit()];
        byteBuffer.get(contentBytes);
        System.out.println(new String(contentBytes));

        // 释放资源
        byteBuffer.clear();
        fileInputStreamChannel.close();
        fileInputStream.close();

    }
}
