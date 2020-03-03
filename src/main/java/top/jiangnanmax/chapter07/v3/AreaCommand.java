package top.jiangnanmax.chapter07.v3;

import top.jiangnanmax.chapter07.v2.Command;

/**
 * @author jiangnan
 * @description AreaCommand
 * @date 2020/3/3
 **/

public class AreaCommand implements ICommand {
    PolyonCalc polyonCalc;
    Point[] pt;

    public AreaCommand(PolyonCalc polyonCalc, Point[] pt) {
        this.polyonCalc = polyonCalc;
        this.pt = pt;
    }

    public float calc() {
        return polyonCalc.getArea(pt);
    }
}
