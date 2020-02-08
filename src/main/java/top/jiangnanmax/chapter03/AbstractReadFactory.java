package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description AbstractReadFactory
 * @date 2020/2/7
 **/

public abstract class AbstractReadFactory {
    public abstract IRead create();

    // 运用反射技术，灵活的返回具体的工厂类
    public static AbstractReadFactory create(String className) {
        AbstractReadFactory factory = null;
        try {
            Class c = Class.forName(className);
            factory = (AbstractReadFactory)c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    /*
        运用反射技术，实现了更加灵活的自动工厂选择功能
        当增加新具体工厂类的时候，无需再修改AbstractReadFactory类
        而且在运用反射技术的前提下，没有必要先利用其产生具体工厂，再生产具体产品，直接利用反射产生具体产品即可
        该类也可以由抽象类变成普通类，见ProductFactory
     */
}
