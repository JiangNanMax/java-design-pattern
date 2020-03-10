package top.jiangnanmax.chapter07.v4;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author jiangnan
 * @description MyFrame
 * @date 2020/3/10
 **/

public class MyFrame extends JFrame {

    JPanel content = new JPanel();

    ActionListener a1 = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            content.removeAll();

            content.setLayout(new FlowLayout()); // 流式布局管理器
            content.add(new JButton("1"));
            content.add(new JButton("2"));
            content.add(new JButton("3"));
            content.add(new JButton("4"));
            content.add(new JButton("5"));
            content.updateUI();
        }
    };

    ActionListener a2 = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            content.removeAll();

            content.setLayout(new BorderLayout()); // 设置方位布局管理器
            content.add(new JButton("北"), BorderLayout.NORTH);
            content.add(new JButton("南"), BorderLayout.SOUTH);
            content.add(new JButton("西"), BorderLayout.WEST);
            content.add(new JButton("东"), BorderLayout.EAST);
            content.add(new JButton("中"), BorderLayout.CENTER);
            content.updateUI();
        }
    };

    public void init() {
        JPanel p = new JPanel();
        JButton btn1 = new JButton("FlowLayout演示");
        JButton btn2 = new JButton("BorderLayout演示");
        p.add(btn1);
        p.add(btn2);

        add(p, BorderLayout.NORTH);
        add(content);


        btn1.addActionListener(a1);
        btn2.addActionListener(a2);

        setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame().init();
    }
}
