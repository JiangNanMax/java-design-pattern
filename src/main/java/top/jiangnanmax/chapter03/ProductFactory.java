package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description ProductFactory
 * @date 2020/2/8
 **/

public class ProductFactory {
    static IRead create(String className) {     // 此处的className为具体产品类名
        IRead product = null;
        try {
            Class c = Class.forName(className);
            product = (IRead)c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }

    /*
        可以看到，上述代码是用于返回IRead产品的，不过只要结合泛型技术，就能具有普遍性
        见ProductFactory2
     */
}
