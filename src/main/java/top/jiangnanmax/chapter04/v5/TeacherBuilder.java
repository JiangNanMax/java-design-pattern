package top.jiangnanmax.chapter04.v5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

/**
 * @author jiangnan
 * @description TeacherBuilder
 * @date 2020/2/12
 **/

public class TeacherBuilder extends UIBuilder implements ActionListener {
    JTextField teaName = new JTextField(10);
    JTextField teaAge = new JTextField(10);
    JTextField teaLesson = new JTextField(10);
    JTextField teaDepart = new JTextField(10);
    JButton updateBtn = new JButton("更新");     // 该按钮需注册事件
    String accountNo;

    public void addUI() {
        JPanel center = new JPanel();
        JPanel south = new JPanel();

        // 第一列垂直对象
        Box b = Box.createVerticalBox();
        b.add(new JLabel("姓名"));
        b.add(Box.createVerticalStrut(8));
        b.add(new JLabel("年龄"));
        b.add(Box.createVerticalStrut(8));
        b.add(new JLabel("课程"));
        b.add(Box.createVerticalStrut(8));
        b.add(new JLabel("学院"));
        b.add(Box.createVerticalStrut(8));

        // 第二列垂直对象
        Box b2 = Box.createVerticalBox();
        b2.add(teaName);
        b2.add(Box.createVerticalStrut(8));
        b2.add(teaAge);
        b2.add(Box.createVerticalStrut(8));
        b2.add(teaLesson);
        b2.add(Box.createVerticalStrut(8));
        b2.add(teaDepart);
        b2.add(Box.createVerticalStrut(8));

        center.add(b);
        center.add(b2);
        south.add(updateBtn);

        panel.setLayout(new BorderLayout());
        panel.add(center, BorderLayout.CENTER);
        panel.add(south, BorderLayout.SOUTH);
    }

    public void registerMsg() {
        updateBtn.addActionListener(this);
    }

    public void initialData(String id) {
        accountNo  = id;
        String strSQL = "select name, age, lesson, depart from teacher where accountNo = '" + accountNo + "'";
        DbProc dbProc = new DbProc();
        try {
            dbProc.connect();
            java.util.List list = (List)dbProc.executeQuery(strSQL);
            Vector vector = (Vector)list.get(0);
            teaName.setText((String)vector.get(0));
            teaAge.setText((String)vector.get(1));
            teaLesson.setText((String)vector.get(2));
            teaDepart.setText((String)vector.get(3));
            dbProc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {
        String name = teaName.getText();
        String age = teaAge.getText();
        String lesson = teaLesson.getText();
        String depart = teaDepart.getText();

        String strSQL = "update teacher set name='" + name + "', age="
                + age + ", lesson='" + lesson + "', depart='" + depart + "'";
        try {
            DbProc dbProc = new DbProc();
            dbProc.connect();
            dbProc.executeUpdate(strSQL);
            dbProc.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
