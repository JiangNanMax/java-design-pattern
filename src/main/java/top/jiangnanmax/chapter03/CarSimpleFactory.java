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

    public static ICar_3_1 create(String mark) throws Exception {
        ICar_3_1 obj = null;
        if (mark.equals(UPTYPE)) {
            obj = new UpCar_3_1();
        } else if (mark.equals(MIDTYPE)) {
            obj = new MidCar_3_1();
        } else if (mark.equals(DNTYPE)) {
            obj = new DnCar_3_1();
        } else {
            throw new Exception("没有对应的类型！");
        }
        return obj;
    }
}
