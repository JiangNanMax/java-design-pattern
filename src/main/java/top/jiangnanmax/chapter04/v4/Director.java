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

/*
    应用示例：
        通用"更新"功能生成器模式代码
        具体见v5
 */
