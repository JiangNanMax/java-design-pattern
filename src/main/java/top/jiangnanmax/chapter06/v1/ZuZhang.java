package top.jiangnanmax.chapter06.v1;

/**
 * @author jiangnan
 * @description ZuZhang
 * @date 2020/2/16
 **/

public class ZuZhang extends Handler {
    static final int limit = 1;
    public boolean handle(Request request) {
        if (request.day <= limit) {
            System.out.println("ZuZhang agree the request!");
            return true;
        }
        return getNext().handle(request);
    }
}
