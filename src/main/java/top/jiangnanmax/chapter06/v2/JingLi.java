package top.jiangnanmax.chapter06.v2;

/**
 * @author jiangnan
 * @description JingLi
 * @date 2020/2/22
 **/

public class JingLi extends Handler {
    @Override
    public boolean handle(Request request) {
        System.out.println("JingLi agrees the request!");
        return true;
    }
}
