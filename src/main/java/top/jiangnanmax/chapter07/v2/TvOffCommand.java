package top.jiangnanmax.chapter07.v2;

/**
 * @author jiangnan
 * @description TvOffCommand
 * @date 2020/3/3
 **/

public class TvOffCommand implements Command {

    TvReceiver tv;

    public TvOffCommand(TvReceiver tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.off();
    }

    public void undo() {
        tv.on();
    }
}
