package top.jiangnanmax.chapter02;

/**
 * @author jiangnan
 * @description Singleton
 * @date 2020/1/13
 **/

// 方法1 直接实例化（饿汉）

public class Singleton {

    private Singleton() {

    }

    private static final Singleton single = new Singleton();

    public static Singleton getInstance() {
        return single;
    }

}
