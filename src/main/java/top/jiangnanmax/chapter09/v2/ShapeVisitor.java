package top.jiangnanmax.chapter09.v2;


import java.lang.reflect.Method;

/**
 * @author jiangnan
 * @description ShapeVisitor
 * @date 2020/3/31
 **/

/*

    新增计算重心坐标，及求三角形内切圆半径功能

 */
public class ShapeVisitor implements IVisitor {

    public Object getCenter(Triangle t) {
        Point point = new Point();
        point.x = (t.x1 + t.x2 + t.x3) / 3;
        point.y = (t.y1 + t.y2 + t.y3) / 3;
        return point;
    }

    public Float getInnerCircleR(Triangle t) {
        float area = t.getArea();
        float len = t.getLength();
        return 2.0f * area / len;
    }

    @Override
    public Object visitor(Triangle t, String method) { // 访问者接口进行方法转发
        Object ans = null;
        try {
            Class classInfo = this.getClass();
            Method mt = classInfo.getMethod(method, Triangle.class);
            ans = mt.invoke(this, new Object[]{t});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ans;
    }

}
