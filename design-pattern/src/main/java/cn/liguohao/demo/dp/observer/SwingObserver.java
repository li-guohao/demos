package cn.liguohao.demo.dp.observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Description Java图形Swing API 中的观察者模式
 * @Author liguohao
 * @Date 2020/9/17 22:49
 */
public class SwingObserver {
    JFrame frame;
    Integer count = 0;

    public static void main(String[] args) {
        new SwingObserver().go();
    }

    public void go(){
        frame = new JFrame();
        JButton jButton = new JButton("我应该上吗？");
        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());
        jButton.addActionListener(e -> System.out.println(count));
        frame.getContentPane().add(BorderLayout.CENTER, jButton);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(-1);
            }
        });
    }


    class AngelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            System.out.println("不要上，你会后悔的！！");
        }
    }

    class DevilListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            System.out.println("上啊，怂什么！");
        }
    }

}
