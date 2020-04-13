package top.jiangnanmax.chapter09.v3;

/**
 * @author jiangnan
 * @description IVisitor
 * @date 2020/4/13
 **/

public interface IVisitor {
    /*
        根据Element1、Element2两个类中的accept方法，
        抽象访问者定义如下
     */
    //void visit(Element1 obj);
    //void visit(Element2 obj);

    /*
        但是，如果IElement有N个子类，抽象访问者不就要定义N个抽象方法？？

        因此，如下解决该问题：
     */
    void visit(IElement obj);
    // 那么，如何判断IElement具体是哪个子类对象呢？ 见OneVisitor
}
