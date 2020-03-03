package top.jiangnanmax.chapter07.v3;

/**
 * @author jiangnan
 * @description PolyonCalc
 * @date 2020/3/3
 **/

public class PolyonCalc {
    public float getArea(Point[] pt) {
        int size = pt.length;
        if (size < 3) return 0;
        float s = pt[0].y * (pt[size - 1].x - pt[1].x);
        for (int i = 1; i < size; i++) {
            s += pt[i].y * (pt[i - 1].x - pt[(i + 1) % size].x);
        }
        return (float)s / 2;
    }

    public float getLength(Point[] pt) {
        int size = pt.length;
        float len = 0;
        for (int i = 0; i < pt.length - 1; i++) {
            len += getDistance(pt[i], pt[i + 1]);
        }
        len += getDistance(pt[0], pt[pt.length - 1]);
        return len;
    }

    public float getDistance(Point one, Point two) {
        return (float)Math.sqrt((one.x - two.x) * (one.x - two.x) + (one.y - two.y) * (one.y - two.y));
    }
}
