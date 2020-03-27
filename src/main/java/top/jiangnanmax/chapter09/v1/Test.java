package top.jiangnanmax.chapter09.v1;

/**
 * @author jiangnan
 * @description Test
 * @date 2020/3/27
 **/

public class Test {
    public static void main(String[] args) {
        IVisitor v = new CenterVisitor();
        Triangle t = new Triangle(0, 0, 2, 0, 0, 2);
        Point p = (Point)t.accept(v);
        System.out.println(p);
    }
}
