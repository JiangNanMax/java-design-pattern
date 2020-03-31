package top.jiangnanmax.chapter09.v2;

/**
 * @author jiangnan
 * @description Test
 * @date 2020/3/31
 **/

/*

    分析v1中的示例可知：若三角形需要新增N个功能，
则需要相应定义N个具体的访问者类。毫无疑问，有时候
这样的代码会显得非常臃肿。

    利用反射技术可以方便解决这个问题。

 */
public class Test {

    public static void main(String[] args) {
        IVisitor v = new ShapeVisitor();
        Triangle t = new Triangle(0, 0, 2, 0, 0, 2);
        Point point = (Point)t.accept(v, "getCenter");
        Float f = (Float)t.accept(v, "getInnerCircleR");
        System.out.println(point);
        System.out.println(f);
    }

}
