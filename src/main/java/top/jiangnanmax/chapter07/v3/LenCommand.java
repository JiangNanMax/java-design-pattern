package top.jiangnanmax.chapter07.v3;

/**
 * @author jiangnan
 * @description LenCommand
 * @date 2020/3/3
 **/

public class LenCommand implements ICommand {
    PolyonCalc polyonCalc;
    Point[] pt;

    public LenCommand(PolyonCalc polyonCalc, Point[] pt) {
        this.polyonCalc = polyonCalc;
        this.pt = pt;
    }

    public float calc() {
        return polyonCalc.getLength(pt);
    }
}
