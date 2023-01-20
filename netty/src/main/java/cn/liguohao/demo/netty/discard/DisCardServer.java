package cn.liguohao.demo.netty.discard;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.SelfSignedCertificate;

import java.net.Socket;

/**传输协议[discard]: 主机可以在传输控制协议 （TCP）或用户数据报协议 （UDP） 的9号端口向支持抛弃协议的服务器发送数据。 发送到服务器的数据被简单地丢弃，没有回复。 因此，通常使用UDP协议，但TCP允许在面向会话的连接中发送该数据（例如，通过HTTP代理或某些VPN ）
 * @see <a href="https://zh.wikipedia.org/wiki/%E6%8A%9B%E5%BC%83%E5%8D%8F%E8%AE%AE">https://zh.wikipedia.org/wiki/抛弃协议</a>
 * @see <a href="https://netty.io/4.1/xref/io/netty/example/discard/DiscardServer.html">https://netty.io/4.1/xref/io/netty/example/discard/DiscardServer.html</a>
 * @author <a href="mailto:liguohao_cn@qq.com">liguohao_cn@qq.com</a>
 * @since 2021/1/30
 */
public class DisCardServer {

    static final boolean SSL = System.getProperty("ssl") != null;
    static final int PORT = Integer.parseInt(System.getProperty("port", "8009"));

    public static void main(String[] args) throws Exception {
        // 配置 SSL
        final SslContext sslContext;
        if(SSL){
            SelfSignedCertificate ssc = new SelfSignedCertificate();
            sslContext = SslContextBuilder.forServer(ssc.certificate(), ssc.privateKey()).build();
        }else {sslContext = null;}

        NioEventLoopGroup bossGroup = new NioEventLoopGroup(1);
        NioEventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)          //指定通道类型
                .handler(new LoggingHandler(LogLevel.INFO))    //指定日志级别
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ChannelPipeline pipeline = ch.pipeline(); //管道
                        if(sslContext != null){
                            pipeline.addLast(sslContext.newHandler(ch.alloc()));
                        }
                        pipeline.addLast(new DiscardServerHandler()); //添加自定义服务端通道处理器
                    }
                });

            // 绑定并开启去接受传入的连接
            ChannelFuture channelFuture = serverBootstrap.bind(PORT).sync();

            // 等待服务器socket关闭
            channelFuture.channel().closeFuture().sync();

        }finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }

    }
}
