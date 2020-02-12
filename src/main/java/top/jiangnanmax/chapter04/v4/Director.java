package top.jiangnanmax.chapter04.v4;

/**
 * @author jiangnan
 * @description Director
 * @date 2020/2/12
 **/

public class Director {
    Product p;
    public Director(Product p) {
        this.p = p;
    }
    void build() {
        p.createUnit();
        p.createUnit2();
        p.createUnit3();
        p.composite();
    }
}
