package top.jiangnanmax.chapter09.v1;

/**
 * @author jiangnan
 * @description Triangle
 * @date 2020/3/27
 **/

public class Triangle implements IShape {

    float x1, y1, x2, y2, x3, y3;

    public Triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    private float getDist(float u1, float v1, float u2, float v2) {
        return (float)Math.sqrt((u1 - u2) * (u1 - u2) + (v1 - v2) * (v1 - v2));
    }

    @Override
    public float getArea() {
        float a = getDist(x1, y1, x2, y2);
        float b = getDist(x1, y1, x3, y3);
        float c = getDist(x2, y2, x3, y3);
        float s = (a + b + c) / 2;
        return (float)Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public float getLength() {
        float a = getDist(x1, y1, x2, y2);
        float b = getDist(x1, y1, x3, y3);
        float c = getDist(x2, y2, x3, y3);
        return a + b + c;
    }

    @Override
    public Object accept(IVisitor v) {
        return v.visit(this);
    }
}
