package cn.liguohao.demo.netty.nio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

/**
 * Java NIO Write File
 *
 * @author <a href="mailto:liguohao_cn@qq.com">liguohao_cn@qq.com</a>
 * @since 2021/3/26
 */
public class NIOWriteFile {
    public static void main(String[] args) throws IOException {

        // 准备目标文件位置
        File file = new File("D://test//nio//message.txt");

        // 父级目录不存在则创建
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        // 获取文件输出通道
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        FileChannel fileOutputStreamChannel = fileOutputStream.getChannel();

        // 准备文件的内容
        String content = "hello world \n蜀道难";

        // 准备缓存区
        ByteBuffer byteBuffer = ByteBuffer.allocate(content.getBytes(StandardCharsets.UTF_8).length);
        // 将内容放入缓存区
        byteBuffer.put(content.getBytes(StandardCharsets.UTF_8));
        // 反转下缓存区
        byteBuffer.flip();

        // 循环将缓存区内容写入通道
        while (true) {
            int read = fileOutputStreamChannel.write(byteBuffer);
            if (read <= 0) {
                break;
            }
        }

        // 释放资源
        byteBuffer.clear();
        fileOutputStreamChannel.close();
        fileOutputStream.close();
    }
}
