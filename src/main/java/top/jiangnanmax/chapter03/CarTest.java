package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description CarTest
 * @date 2020/2/6
 **/

public class CarTest {
    public static void main(String[] args) {    // 针对工厂模式的测试，显而易见，明显优于简单工厂
        AbstractFactory factory = new UpFactory();  // 多态创建高档工厂
        ICar car = factory.create();    // 获得高档工厂new出来的小汽车对象
    }
}
