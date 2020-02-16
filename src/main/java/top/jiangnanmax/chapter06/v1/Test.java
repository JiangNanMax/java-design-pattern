package top.jiangnanmax.chapter06.v1;

/**
 * @author jiangnan
 * @description Test
 * @date 2020/2/16
 **/

public class Test {
    public static void main(String[] args) {
        Request request = new Request(6);
        MyChain myChain = new MyChain();
        myChain.createChain();
        myChain.handle(request);
    }
}
