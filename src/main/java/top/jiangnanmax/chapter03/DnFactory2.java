package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description DnFactory2
 * @date 2020/2/6
 **/

public class DnFactory2 extends AbstractFactory22 {
    public ICar create() {
        return new DnCar();
    }
}
