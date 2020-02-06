package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description UpFactory
 * @date 2020/2/6
 **/

public class UpFactory extends AbstractFactory {
    public ICar create() {
        return new UpCar();     // 高档工厂生成高档小汽车对象
    }
}
