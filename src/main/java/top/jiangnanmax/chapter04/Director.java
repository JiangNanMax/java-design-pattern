package top.jiangnanmax.chapter04;

/**
 * @author jiangnan
 * @description Director
 * @date 2020/2/9
 **/


public class Director {
    private IBuilder builder;
    public Director(IBuilder builder) {
        this.builder = builder;
    }
    public Product build(Unit u, Unit2 u2, Unit3 u3) {
        builder.createUnit(u);
        builder.createUnit2(u2);
        builder.createUnit3(u3);
        return builder.composite();
    }

    public static void main(String[] args) {
        IBuilder builder = new ProductBuilder();
        Director director = new Director(builder);
        Product p = director.build(new Unit(), new Unit2(), new Unit3());
    }
}
// 至此，上述的代码构成了标准的建造者模式
// 主要涉及了四个关键角色：产品、抽象生成器、具体生成器、指挥者
// 分析可知，若需求分析发生变化，只需增加或者删除相应的生成器类即可

// 但是还有一个问题，就是如果要生产两种产品，一种需要三个过程，另一种需要四个过程，
// 此时若用标准的建造者模式就不行了，具体见package v2 --- 也叫弱生成器模式

/*
    补充：由于这里只是通过简单的例子来说明建造者模式的工作流程，
        可能会觉得为啥不直接 new Product(...) 就完事了呢
        试设想，若某种需求下的对象构造过程具有特定的流程需要等，
        通过上述的代码封装，不仅保证了流程的正确性，而且大大节省了代码量以及程序的可维护性和可扩展性
 */