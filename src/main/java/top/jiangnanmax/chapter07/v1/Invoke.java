package top.jiangnanmax.chapter07.v1;

/**
 * @author jiangnan
 * @description Invoke
 * @date 2020/3/1
 **/

public class Invoke {
    ICommand command;

    public Invoke(ICommand command) {
        this.command = command;
    }

    public void execute() {
        command.sweep();
    }
}
