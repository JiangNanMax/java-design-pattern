package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description UpFactory2
 * @date 2020/2/6
 **/

public class UpFactory2 extends AbstractFactory21 {
    public ICar create21() {
        return new UpCar();
    }

    public IBus create22() {
        return new UpBus();
    }
}
