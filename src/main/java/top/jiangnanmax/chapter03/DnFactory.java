package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description DnFactory
 * @date 2020/2/6
 **/

public class DnFactory extends AbstractFactory {
    public ICar create() {
        return new DnCar();     // 低档工厂生成低档小汽车对象
    }
}
