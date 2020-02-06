package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description DnFactory1
 * @date 2020/2/6
 **/

public class DnFactory1 extends AbstractFactory1 {
    public ICar create11() {
        return new DnCar();
    }

    public IBus create12() {
        return new DnBus();
    }
}
