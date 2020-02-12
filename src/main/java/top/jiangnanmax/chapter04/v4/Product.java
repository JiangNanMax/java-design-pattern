package top.jiangnanmax.chapter04.v4;

/**
 * @author jiangnan
 * @description Product
 * @date 2020/2/12
 **/

public abstract class Product {
    Unit u;
    Unit2 u2;
    Unit3 u3;

    abstract void createUnit();
    abstract void createUnit2();
    abstract void createUnit3();
    abstract void composite();
}
