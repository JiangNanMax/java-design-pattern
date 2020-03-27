package top.jiangnanmax.chapter09.v1;

/**
 * @author jiangnan
 * @description IShape
 * @date 2020/3/27
 **/

/*

    考虑这样一个应用：已知三点坐标，编写功能类，
求所围三角形的面积和周长。
    如果采用访问者模式架构，应当这样思考：目前
已确定的需求分析是求面积和周长功能，但有可能将来
求三角形的重心、垂心坐标，内切、外接圆的半径等。
因此，在设计时必须考虑如何屏蔽这些不确定的情况。

 */
public interface IShape {
    float getArea();            // 明确的需求分析
    float getLength();          // 明确的需求分析
    Object accept(IVisitor v);  // 可扩展的需求分析
}
