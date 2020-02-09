package top.jiangnanmax.chapter04.v2;

/**
 * @author jiangnan
 * @description ProductBuilder
 * @date 2020/2/9
 **/

public class ProductBuilder implements IBuild {
    Product p = new Product();

    public void createUnit() {} // 创建Unit -> p.u

    public void createUnit2() {} // 创建Unit2 -> p.u2

    public void createUnit3() {} // 创建Unit3 -> p.u3

    public Product composite() {
        // ...
        return p;
    }

    public Product create() {
        createUnit();
        createUnit2();
        createUnit3();
        return composite();
    }
}
