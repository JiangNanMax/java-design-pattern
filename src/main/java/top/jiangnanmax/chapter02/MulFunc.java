package top.jiangnanmax.chapter02;

/**
 * @author jiangnan
 * @description MulFunc
 * @date 2020/2/4
 **/

public class MulFunc implements IFunc {
    private MulFunc() {}

    private static class My {
        private static final MulFunc single = new MulFunc();
    }

    public static MulFunc getInstance() {
        return My.single;
    }

    public int service(int param1, int param2) {
        return param1 * param2;
    }
}
