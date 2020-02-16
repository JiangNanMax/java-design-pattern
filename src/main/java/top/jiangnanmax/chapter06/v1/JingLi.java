package top.jiangnanmax.chapter06.v1;

/**
 * @author jiangnan
 * @description JingLi
 * @date 2020/2/16
 **/

public class JingLi extends Handler {
    public boolean handle(Request request) {
        System.out.println("JingLi agree the request!");
        return true;
    }
}
