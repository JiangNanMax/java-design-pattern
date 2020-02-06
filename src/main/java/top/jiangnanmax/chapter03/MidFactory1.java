package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description MidFactory1
 * @date 2020/2/6
 **/

public class MidFactory1 extends AbstractFactory1 {
    public ICar create11() {
        return new MidCar();
    }

    public IBus create12() {
        return new MidBus();
    }
}
