package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description SuperFactory
 * @date 2020/2/6
 **/

public class SuperFactory extends AbstractFactory {
    public ICar create() {
        return new SuperCar();
    }
}
