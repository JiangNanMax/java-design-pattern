package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description ProductFactory2
 * @date 2020/2/8
 **/

public class ProductFactory2<T> {   // T为各自定义的产品接口
    public T create(String className) {
        T product = null;
        try {
            Class c = Class.forName(className);
            product = (T)c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }
}
