package top.jiangnanmax.chapter02;

import java.util.Scanner;

/**
 * @author jiangnan
 * @description Test
 * @date 2020/1/1
 **/

public class Test {
    public static void main(String[] args) {
        /*
        Scanner s = new Scanner(System.in);
        s.nextLine();
        Singleton3 obj = Singleton3.getInstance();
        System.out.println(111);
        Singleton3 obj2 = Singleton3.getInstance();
        */
        String tmp = "hk15059098650";
        long i = tmp.hashCode();
        System.out.println(i);
    }
}
