package top.jiangnanmax.chapter06.v1;

/**
 * @author jiangnan
 * @description Handler
 * @date 2020/2/16
 **/

public abstract class Handler {
    private Handler next;   // 后继处理者变量

    public void setNext(Handler handler) {
        this.next = handler;
    }

    public Handler getNext() {
        return next;
    }

    public abstract boolean handle(Request request);    // 抽象请求方法，由子类要重写

}
