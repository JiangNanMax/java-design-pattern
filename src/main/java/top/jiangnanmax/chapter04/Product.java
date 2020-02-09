package top.jiangnanmax.chapter04;

/**
 * @author jiangnan
 * @description Product
 * @date 2020/2/9
 **/

public class Product {
    private Unit u;
    private Unit2 u2;
    private Unit3 u3;

    public Product(Unit u, Unit2 u2, Unit3 u3) {
        this.u = u;
        this.u2 = u2;
        this.u3 = u3;
    }

    public Unit getU() {
        return u;
    }

    public void setU(Unit u) {
        this.u = u;
    }

    public Unit2 getU2() {
        return u2;
    }

    public void setU2(Unit2 u2) {
        this.u2 = u2;
    }

    public Unit3 getU3() {
        return u3;
    }

    public void setU3(Unit3 u3) {
        this.u3 = u3;
    }
}
