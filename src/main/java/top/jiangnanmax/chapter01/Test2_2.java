package top.jiangnanmax.chapter01;

import javax.swing.*;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author jiangnan
 * @description Test2_2
 * @date 2020/1/8
 **/

public class Test2_2 {

    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        p.load(new FileInputStream("/Users/jiangnan/IdeaProjects/java-design-pattern/src/main/java/top/jiangnanmax/chapter01/msg.properties"));
        String cname = p.getProperty("func");
        IMsg obj = null;
        obj = (IMsg)Class.forName(cname).newInstance();
        obj.process("jiangnan");
    }

}
