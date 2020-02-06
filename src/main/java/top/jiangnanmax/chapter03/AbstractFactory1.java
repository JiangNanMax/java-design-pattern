package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description AbstractFactory1
 * @date 2020/2/6
 **/

public abstract class AbstractFactory1 {    // 多产品系，且全部特征相同
    public abstract ICar create11();    // 产生小汽车对象
    public abstract IBus create12();    // 产生公共汽车对象
}
