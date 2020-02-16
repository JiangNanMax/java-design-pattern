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

/*
        很明显，上述代码所形成的责任链过于刚性，
    若需求发生了变化，则必须修改MyChain类。

        更加灵活的方法，具体见v2
 */
