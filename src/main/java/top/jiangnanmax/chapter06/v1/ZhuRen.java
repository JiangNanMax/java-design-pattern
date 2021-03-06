package top.jiangnanmax.chapter06.v1;

/**
 * @author jiangnan
 * @description ZhuRen
 * @date 2020/2/16
 **/

public class ZhuRen extends Handler {
    static final int limit = 2;
    public boolean handle(Request request) {
        if (request.day <= limit) {
            System.out.println("ZhuRen agree the request!");
            return true;
        }
        return getNext().handle(request);
    }
}

