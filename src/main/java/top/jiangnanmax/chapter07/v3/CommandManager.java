package top.jiangnanmax.chapter07.v3;


import java.util.ArrayList;

/**
 * @author jiangnan
 * @description CommandManager
 * @date 2020/3/3
 **/

public class CommandManager {
    ArrayList<ICommand> list = new ArrayList<ICommand>();
    public void add(ICommand c) {
        list.add(c);
    }
    public void executeCommands() {
        for (ICommand iCommand : list) {
            float value = iCommand.calc();
            System.out.println(value);
        }
    }
}
