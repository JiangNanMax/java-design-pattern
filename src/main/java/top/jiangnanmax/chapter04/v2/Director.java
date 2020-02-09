package top.jiangnanmax.chapter04.v2;

/**
 * @author jiangnan
 * @description Director
 * @date 2020/2/9
 **/

public class Director {
    private IBuild build;

    public Director(IBuild build) {
        this.build = build;
    }

    public Product build() {
        return build.create();
    }
}

/*
    其实这里的Director可以略去
    实际问题实际取舍
 */

/*
    还有一种情况，如果产品类中的某些或者全部属性是final的呢？
    上述两种思路肯定不适用
    具体见v3
 */
