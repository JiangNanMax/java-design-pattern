package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description UpFactory1
 * @date 2020/2/6
 **/

public class UpFactory1 extends AbstractFactory1 {
    public ICar create11() {
        return new UpCar();
    }

    public IBus create12() {
        return new UpBus();
    }
}
