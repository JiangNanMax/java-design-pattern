package top.jiangnanmax.chapter09.v3;

/**
 * @author jiangnan
 * @description IElement
 * @date 2020/4/13
 **/

/*
    定义抽象事物IElement
 */
public interface IElement {

    void accept(IVisitor v);

}
