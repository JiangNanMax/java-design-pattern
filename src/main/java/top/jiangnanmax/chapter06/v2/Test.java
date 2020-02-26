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

/*
    还可以通过回调技术来实现责任链模式
    具体见v3
 */
