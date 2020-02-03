package top.jiangnanmax.chapter02;

/**
 * @author jiangnan
 * @description PlusFunc
 * @date 2020/2/2
 **/

public class PlusFunc implements IFunc {
    private PlusFunc() {}

    private static class My {
        private static final PlusFunc single = new PlusFunc();
    }

    public static PlusFunc getInstance() {
        return My.single;
    }

    public int service(int param1, int param2) {
        return param1 + param2;
    }
}
