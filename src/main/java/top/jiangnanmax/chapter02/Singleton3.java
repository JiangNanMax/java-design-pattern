package top.jiangnanmax.chapter02;

/**
 * @author jiangnan
 * @description Singleton3
 * @date 2020/1/1
 **/

// 方法3 静态内部类

public class Singleton3 {
    private static class My {
        private static final Singleton3 single = new Singleton3();
    }

    private Singleton3() {
        System.out.println("This is new instance.");
    }

    public static Singleton3 getInstance() {
        return My.single;
    }
}
