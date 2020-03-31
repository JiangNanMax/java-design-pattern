package top.jiangnanmax.chapter09.v2;

/**
 * @author jiangnan
 * @description IVisitor
 * @date 2020/3/31
 **/

public interface IVisitor {

    Object visitor(Triangle t, String method);

}
