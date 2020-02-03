package top.jiangnanmax.chapter02;

/**
 * @author jiangnan
 * @description MinusFunc
 * @date 2020/2/2
 **/

public class MinusFunc implements IFunc {
    private MinusFunc() {}

    private static class My {
        private static final MinusFunc single = new MinusFunc();
    }

    public static MinusFunc getInstance() {
        return My.single;
    }

    public int service(int param1, int param2) {
        return param1 - param2;
    }
}
