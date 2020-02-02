package top.jiangnanmax.chapter01;

import java.util.Scanner;

/**
 * @author jiangnan
 * @description Test
 * @date 2020/1/8
 **/

public class Test {

    public static void main(String[] args) throws Exception {
        IMsg obj = null;
        String className = null;
        Scanner in = new Scanner(System.in);
        className = in.nextLine();
        obj = (IMsg)Class.forName(className).newInstance();
        obj.process("hello");
    }

}
