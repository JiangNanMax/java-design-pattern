package top.jiangnanmax.chapter06.v2;

/**
 * @author jiangnan
 * @description Test
 * @date 2020/2/22
 **/

public class Test {
    public static void main(String[] args) {
        Request request = new Request(10);
        MyChain myChain = new MyChain();
        myChain.createChain();
        myChain.handle(request);
    }
}
