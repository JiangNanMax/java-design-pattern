package top.jiangnanmax.chapter04;

/**
 * @author jiangnan
 * @description ProductBuilder
 * @date 2020/2/9
 **/

public class ProductBuilder implements IBuilder {
    private Unit u;
    private Unit2 u2;
    private Unit3 u3;

    public void createUnit(Unit u) {
        this.u = u;
    }

    public void createUnit2(Unit2 u2) {
        this.u2 = u2;
    }

    public void createUnit3(Unit3 u3) {
        this.u3 = u3;
    }

    public Product composite() {
        return new Product(u, u2, u3);
    }
}
