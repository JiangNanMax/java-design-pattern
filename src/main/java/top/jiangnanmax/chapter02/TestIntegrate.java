package top.jiangnanmax.chapter02;

/**
 * @author jiangnan
 * @description TestIntegrate
 * @date 2020/2/4
 **/

public class TestIntegrate {
    public static void main(String[] args) {
        MyIntegrate.init();
        try {
            MyIntegrate.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
