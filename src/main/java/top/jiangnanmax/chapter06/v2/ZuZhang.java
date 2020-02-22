package top.jiangnanmax.chapter06.v2;

/**
 * @author jiangnan
 * @description ZuZhang
 * @date 2020/2/22
 **/

public class ZuZhang extends Handler {
    static final int limit = 1;
    @Override
    public boolean handle(Request request) {
        if (request.day <= limit) {
            System.out.println("ZuZhang agrees the request!");
            return true;
        }
        return getNext().handle(request);
    }
}
