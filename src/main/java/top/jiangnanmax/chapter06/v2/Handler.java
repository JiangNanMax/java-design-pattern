package top.jiangnanmax.chapter06.v2;

/**
 * @author jiangnan
 * @description Handler
 * @date 2020/2/22
 **/

public abstract class Handler {
    private Handler next;

    public void setNext(Handler handler) {
        this.next = handler;
    }

    public Handler getNext() {
        return next;
    }

    public abstract boolean handle(Request request);
}
