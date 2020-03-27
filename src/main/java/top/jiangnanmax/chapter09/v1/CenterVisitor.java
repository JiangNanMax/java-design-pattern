package top.jiangnanmax.chapter09.v1;

/**
 * @author jiangnan
 * @description CenterVisitor
 * @date 2020/3/27
 **/

public class CenterVisitor implements IVisitor {
    @Override
    public Object visit(Triangle t) {
        Point point = new Point();
        point.x = (t.x1 + t.x2 + t.x3) / 3;
        point.y = (t.y1 + t.y2 + t.y3) / 3;
        return point;
    }
}
