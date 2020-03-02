package top.jiangnanmax.chapter07.v2;

/**
 * @author jiangnan
 * @description LightOnCommand
 * @date 2020/3/2
 **/

public class LightOnCommand implements Command {

    // 聚合LightReceiver
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
