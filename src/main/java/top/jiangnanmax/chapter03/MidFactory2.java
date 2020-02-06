package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description MidFactory2
 * @date 2020/2/6
 **/

public class MidFactory2 extends AbstractFactory21 {
    public ICar create21() {
        return new MidCar();
    }

    public IBus create22() {
        return new MidBus();
    }
}
