package top.jiangnanmax.chapter04.v5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

/**
 * @author jiangnan
 * @description StudentBuilder
 * @date 2020/2/12
 **/

public class StudentBuilder extends UIBuilder implements ActionListener {
    JTextField stuName = new JTextField(10);
    JTextField stuAge = new JTextField(10);
    JTextField stuMajor = new JTextField(10);
    JTextField stuDepart = new JTextField(10);
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
        b.add(new JLabel("专业"));
        b.add(Box.createVerticalStrut(8));
        b.add(new JLabel("学院"));
        b.add(Box.createVerticalStrut(8));

        // 第二列垂直对象
        Box b2 = Box.createVerticalBox();
        b2.add(stuName);
        b2.add(Box.createVerticalStrut(8));
        b2.add(stuAge);
        b2.add(Box.createVerticalStrut(8));
        b2.add(stuMajor);
        b2.add(Box.createVerticalStrut(8));
        b2.add(stuDepart);
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
        String strSQL = "select name, age, major, depart from student where accountNo = '" + accountNo + "'";
        DbProc dbProc = new DbProc();
        try {
            dbProc.connect();
            List list = (List)dbProc.executeQuery(strSQL);
            Vector vector = (Vector)list.get(0);
            stuName.setText((String)vector.get(0));
            stuAge.setText((String)vector.get(1));
            stuMajor.setText((String)vector.get(2));
            stuDepart.setText((String)vector.get(3));
            dbProc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {    // 获得界面数据、更新数据库
        String name = stuName.getText();
        String age = stuAge.getText();
        String major = stuMajor.getText();
        String depart = stuDepart.getText();

        String strSQL = "update student set name='" + name + "', age="
                        + age + ", major='" + major + "', depart='" + depart + "'";
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
