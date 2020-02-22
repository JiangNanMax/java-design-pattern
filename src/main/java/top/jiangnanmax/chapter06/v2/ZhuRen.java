package top.jiangnanmax.chapter06.v2;

/**
 * @author jiangnan
 * @description ZhuRen
 * @date 2020/2/22
 **/

public class ZhuRen extends Handler {
    static final int limit = 2;
    @Override
    public boolean handle(Request request) {
        if (request.day <= limit) {
            System.out.println("ZhuRen agrees the request!");
            return true;
        }
        return getNext().handle(request);
    }
}
