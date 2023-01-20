package cn.liguohao.demo.netty.bio;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

/**
 * Java BIO Client
 *
 * @author <a href="mailto:liguohao_cn@qq.com">liguohao_cn@qq.com</a>
 * @since 2021/3/26
 */
public class BIOClient {
    public static void main(String[] args) throws IOException {
        SocketAddress socketAddress = new InetSocketAddress("127.0.0.1", 8888);

        while (true) {

            System.out.println("请输入需要发生的内容：");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();

            if (line.length() > 0) {
                Socket socket = new Socket();
                socket.connect(socketAddress);
                OutputStream outputStream = null;
                try {
                    outputStream = socket.getOutputStream();
                    outputStream.write(line.getBytes());
                    outputStream.flush();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                } finally {
                    try {
                        outputStream.close();
                        socket.close();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
            }

        }

    }
}
