package top.jiangnanmax.chapter09.v2;

/**
 * @author jiangnan
 * @description IShape
 * @date 2020/3/31
 **/

public interface IShape {
    float getArea();
    float getLength();
    Object accept(IVisitor v, String method);
}

// 与v1示例相比，仅可变方法accept()有不同，增加了字符串变量
// method，代表将要采用反射技术的方法名称
