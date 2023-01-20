package cn.liguohao.demo.dp.cdcover;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Description 
 * @Author liguohao
 * @Date 2020/10/4 15:00
 */
public class DriverTest {
    public static void main(String[] args) {
        ImageComponent imageComponent;
        Frame frame = new Frame("CD 封面加载");
        //https://liguohao.cn/upload/2020/10/e8ffe18536cb6824985de6a8f16d7e6f81440638-8462a318404f4ba8a329199fa89b14a5.jpg
        try {
            URL url = new URL("https","liguohao.cn",80,"upload/2020/10/e8ffe18536cb6824985de6a8f16d7e6f81440638-8462a318404f4ba8a329199fa89b14a5.jpg");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
