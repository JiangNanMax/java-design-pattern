package top.jiangnanmax.chapter02;

/**
 * @author jiangnan
 * @description Singleton2
 * @date 2020/1/13
 **/

// 方法2 延迟实例化（懒汉）
// 此方法存在线程安全问题，可使用同步以解决

public class Singleton2 {

    private Singleton2() {

    }

    private static Singleton2 single = null;

    public static Singleton2 getInstance() {
        if (single == null) {
            single = new Singleton2();
        }
        return single;
    }

    // 同步方法1 完全同步
    public static synchronized Singleton2 getInstance1() {
        if (single == null) {
            single = new Singleton2();
        }
        return single;
    }

    // 同步方法2 部分同步
    public static Singleton2 getInstance2() {
        if (single == null) {
            synchronized (Singleton2.class) {
                if (single == null) {
                    single = new Singleton2();
                }
            }
        }
        return single;
    }

}
