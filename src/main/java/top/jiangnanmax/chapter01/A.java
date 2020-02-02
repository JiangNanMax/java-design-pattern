package top.jiangnanmax.chapter01;

import java.lang.reflect.*;

/**
 * @author jiangnan
 * @description A
 * @date 2019/12/30
 **/

// 例 1-1 统一形式解析类的构造方法、成员变量、成员方法

public class A {

    int m;

    public A() {}

    public A(int m) {}

    private void func1() {

    }

    private void func2() {

    }

    public static void main(String[] args) throws Exception {
        // 加载并初始化制定的类A
        Class classInfo = Class.forName("top.jiangnanmax.chapter01.A");

        // 获得类的构造函数
        System.out.println("类A的构造函数如下所示：");
        Constructor cons[] = classInfo.getConstructors();
        for (int i = 0; i < cons.length; i++) {
            System.out.println(cons[i].toString());
        }

        // 获取所有的成员变量
        System.out.println();
        System.out.println("类A的所有成员变量如下所示：");
        Field fields[] = classInfo.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].toString());
        }

        // 获取所有的成员方法
        System.out.println();
        System.out.println("类A的所有成员方法如下所示：");
        Method methods[] = classInfo.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].toString());
        }

    }

}
