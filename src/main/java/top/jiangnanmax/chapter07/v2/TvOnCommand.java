package top.jiangnanmax.chapter07.v2;

/**
 * @author jiangnan
 * @description TvOnCommand
 * @date 2020/3/3
 **/

public class TvOnCommand implements Command {

    TvReceiver tv;

    public TvOnCommand(TvReceiver tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.on();
    }

    public void undo() {
        tv.off();
    }
}
