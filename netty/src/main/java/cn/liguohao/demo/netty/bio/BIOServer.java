package cn.liguohao.demo.netty.bio;


import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Java BIO Server
 *
 * @author <a href="mailto:liguohao_cn@qq.com">liguohao_cn@qq.com</a>
 * @since 2021/3/26
 */
public class BIOServer {
    public static void main(String[] args) throws IOException {

        // 初始化一个线程池
        int corePoolSize = 5;
        int maximumPoolSize = 20;
        long keepAliveTime = 60 * 30;
        ArrayBlockingQueue taskQueue = new ArrayBlockingQueue(10);
        ThreadPoolExecutor.CallerRunsPolicy callerRunsPolicy = new ThreadPoolExecutor.CallerRunsPolicy();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.SECONDS, taskQueue, callerRunsPolicy);

        // 创建一个服务端socket连接
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端线程id=" + Thread.currentThread().getId() + " name=" + Thread.currentThread().getName());

        while (true) {

            // 等待客户端连接
            Socket socket = serverSocket.accept();

            // 开启一个线程读取客户端数据
            threadPoolExecutor.execute(() -> {
                try {
                    readClientData(socket);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                } finally {
                    try {
                        System.out.println("socket关闭 ==> 客户端线程id=" + Thread.currentThread().getId() + " name=" + Thread.currentThread().getName());
                        socket.close();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
            });
        }
    }

    /**
     * 读取客户端数据
     *
     * @param socket 客户端Socket连接
     */
    private static void readClientData(Socket socket) throws IOException {

        System.out.println("连接到服务端的客户端线程id=" + Thread.currentThread().getId() + " name=" + Thread.currentThread().getName());

        // 缓冲字节数组
        byte[] cacheBytes = new byte[1024];

        while (true) {
            InputStream inputStream = socket.getInputStream();
            int read = inputStream.read(cacheBytes);
            if (read == -1) {
                break;
            } else {
                System.out.println("读取到的数据为 ==> " + new String(cacheBytes));
            }
        }

    }
}
