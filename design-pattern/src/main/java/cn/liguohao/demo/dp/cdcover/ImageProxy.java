package cn.liguohao.demo.dp.cdcover;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/10/4 14:08
 */
public class ImageProxy implements Icon {

    private ImageIcon imageIcon;            //被代理的对象
    private URL imageURL;                   //远程网络服务器资源定位符
    private Thread retrievalThread;         //异步加载图片的线程
    boolean retrieving = false;             //是否正在加载中

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if(imageIcon!=null){
            imageIcon.paintIcon(c,g,x,y);
        }else {
            g.drawString("正在玩命加载中...",x+300,y+190);
            if(!retrieving){ //为在加载图片
                retrieving = true; //更新状态为正在加载图片
                retrievalThread = new Thread(()->{
                    try {
                        imageIcon = new ImageIcon(imageURL,"sss");
                        c.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println(e.getMessage());
                    }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if(imageIcon != null){
            return imageIcon.getIconWidth();
        }
        return 800;
    }

    @Override
    public int getIconHeight() {
        if(imageIcon!=null){
            return imageIcon.getIconHeight();
        }
        return 600;
    }


}
