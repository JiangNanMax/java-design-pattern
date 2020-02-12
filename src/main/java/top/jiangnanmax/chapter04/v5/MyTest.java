package top.jiangnanmax.chapter04.v5;

import javax.swing.*;

/**
 * @author jiangnan
 * @description MyTest
 * @date 2020/2/12
 **/

public class MyTest {
    public static void main(String[] args) {
        /*  student case
        JFrame jFrame = new JFrame();
        UIBuilder uiBuilder = new StudentBuilder();
        Director director = new Director(uiBuilder);
        JPanel panel = director.build("10165102232");
        jFrame.add(panel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
         */

        // teacher case
        JFrame jFrame = new JFrame();
        UIBuilder uiBuilder = new TeacherBuilder();
        Director director = new Director(uiBuilder);
        JPanel panel = director.build("12345");
        jFrame.add(panel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);

    }
}
