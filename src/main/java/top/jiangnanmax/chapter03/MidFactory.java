package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description MidFactory
 * @date 2020/2/6
 **/

public class MidFactory extends AbstractFactory {
    public ICar create() {
        return new MidCar();    // 中档工厂生成中档小汽车对象
    }
}
