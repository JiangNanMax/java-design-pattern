package top.jiangnanmax.chapter01;

import java.lang.reflect.*;

/**
 * @author jiangnan
 * @description B
 * @date 2020/1/7
 **/

// 例子 1-2 统一形式调用构造方法

public class B {

    public B() {
        System.out.println("This is A:");
    }

    public B(Integer m) {
        System.out.println("This is " + m);
    }

    public B(String s, Integer m) {
        System.out.println(s + " : " + m);
    }

    public static void main(String[] args) throws Exception {
        Class classInfo = Class.forName("top.jiangnanmax.chapter01.B");

        // 第1种方法
        // ！顺序并不是书中的那样
        Constructor cons[] = classInfo.getConstructors();
        // 调用无参构造函数
        cons[0].newInstance(new Object[]{"hello", 10});
        // 调用1个参数构造函数
        cons[1].newInstance(new Object[]{10});
        // 调用2个参数构造函数
        cons[2].newInstance();

        System.out.println("\n\n");

        // 第2种方法

        // 调用无参构造函数
        Constructor c = classInfo.getConstructor();
        c.newInstance();

        // 调用1个参数构造方法
        //c = classInfo.getConstructor(new Class[]{Integer.class});
        c = classInfo.getConstructor(Integer.class);
        c.newInstance(new Object[]{10});

        // 调用2个参数构造方法
        //c = classInfo.getConstructor(new Class[]{String.class, Integer.class});
        c = classInfo.getConstructor(String.class, Integer.class);
        c.newInstance(new Object[]{"hello", 2020});

    }

}
