package top.jiangnanmax.chapter07.v3;

/**
 * @author jiangnan
 * @description Test
 * @date 2020/3/3
 **/

public class Test {
    public static void main(String[] args) {
        CommandManager commandManager = new CommandManager();
        Point[] pt = new Point[3];
        pt[0] = new Point(0, 0);
        pt[1] = new Point(1, 0);
        pt[2] = new Point(0, 1);
        PolyonCalc polyonCalc = new PolyonCalc();
        AreaCommand areaCommand = new AreaCommand(polyonCalc, pt);
        LenCommand lenCommand = new LenCommand(polyonCalc, pt);
        commandManager.add(areaCommand);
        commandManager.add(lenCommand);
        commandManager.executeCommands();
    }
}
