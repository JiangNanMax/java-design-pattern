package top.jiangnanmax.chapter04;

/**
 * @author jiangnan
 * @description IBuild
 * @date 2020/2/9
 **/

public interface IBuilder {
    void createUnit(Unit u);
    void createUnit2(Unit2 u2);
    void createUnit3(Unit3 u3);
    Product composite();
}
