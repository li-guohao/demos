package cn.liguohao.demo.netty.discard;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**服务端通道处理器
 * @author <a href="mailto:liguohao_cn@qq.com">liguohao_cn@qq.com</a>
 * @see <a href="https://netty.io/4.1/xref/io/netty/example/discard/DiscardServerHandler.html">https://netty.io/4.1/xref/io/netty/example/discard/DiscardServerHandler.html</a>
 * @since 2021/1/30
 */
public class DiscardServerHandler extends SimpleChannelInboundHandler<Object> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        // 抛弃消息，不做处理
//        System.out.println(msg);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        // 当异常发生 关闭连接
        cause.printStackTrace();
        ctx.close();
    }
}
