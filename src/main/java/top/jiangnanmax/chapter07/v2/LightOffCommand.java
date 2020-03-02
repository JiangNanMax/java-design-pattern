package top.jiangnanmax.chapter07.v2;

/**
 * @author jiangnan
 * @description LightOffCommand
 * @date 2020/3/2
 **/

public class LightOffCommand implements Command {

    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
