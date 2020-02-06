package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description CarSimpleFactory
 * @date 2020/1/30
 **/

public class CarSimpleFactory {
    public static final String UPTYPE = "uptype";
    public static final String MIDTYPE = "midtype";
    public static final String DNTYPE = "dntype";

    public static ICar create(String mark) throws Exception {   // 如此的话，耦合度极高，不易于扩展，例如，新增一个超高档类型的汽车，则需对if结构进行修改
        ICar obj = null;
        if (mark.equals(UPTYPE)) {
            obj = new UpCar();
        } else if (mark.equals(MIDTYPE)) {
            obj = new MidCar();
        } else if (mark.equals(DNTYPE)) {
            obj = new DnCar();
        } else {
            throw new Exception("没有对应的类型！");
        }
        return obj;
    }
}
