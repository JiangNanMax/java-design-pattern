package top.jiangnanmax.chapter06.v1;

/**
 * @author jiangnan
 * @description MyChain
 * @date 2020/2/16
 **/

// 生成责任链前后顺序关系
public class MyChain {
    private Handler one = new ZuZhang();
    private Handler two = new ZhuRen();
    private Handler three = new JingLi();

    public void createChain() {
        one.setNext(two);
        two.setNext(three);
    }

    public void handle(Request request) {
        one.handle(request);
    }
}
