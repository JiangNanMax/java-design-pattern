package top.jiangnanmax.chapter07.v5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author jiangnan
 * @description MyFrame
 * @date 2020/3/12
 **/

public class MyFrame extends JFrame implements ActionListener {

    JPanel content = new JPanel();

    class FlowBtn extends JButton implements IReceiver {

        public FlowBtn(String name) {
            super(name);
        }

        public void response() {
            content.removeAll();

            content.setLayout(new FlowLayout()); // 流式布局管理器
            content.add(new JButton("1"));
            content.add(new JButton("2"));
            content.add(new JButton("3"));
            content.add(new JButton("4"));
            content.add(new JButton("5"));
            content.updateUI();
        }
    }

    class BorderBtn extends JButton implements IReceiver {

        public BorderBtn(String name) {
            super(name);
        }

        public void response() {
            content.removeAll();

            content.setLayout(new BorderLayout()); // 设置方位布局管理器
            content.add(new JButton("北"), BorderLayout.NORTH);
            content.add(new JButton("南"), BorderLayout.SOUTH);
            content.add(new JButton("西"), BorderLayout.WEST);
            content.add(new JButton("东"), BorderLayout.EAST);
            content.add(new JButton("中"), BorderLayout.CENTER);
            content.updateUI();
        }
    }

    public void init() {
        JPanel p = new JPanel();
        JButton btn1 = new FlowBtn("FlowLayout演示");
        JButton btn2 = new BorderBtn("BorderLayout演示");
        p.add(btn1);
        p.add(btn2);

        add(p, BorderLayout.NORTH);
        add(content);


        btn1.addActionListener(this);
        btn2.addActionListener(this);

        setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        IReceiver iReceiver = (IReceiver)e.getSource();
        iReceiver.response();
    }

    public static void main(String[] args) {
        new MyFrame().init();
    }
}
