package top.jiangnanmax.chapter07.v2;

/**
 * @author jiangnan
 * @description remoteController
 * @date 2020/3/2
 **/

public class RemoteController {

    // 开/关按钮的命令组
    Command[] onCommands;
    Command[] offCommands;

    // 记忆以用于撤销指令
    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void onBtnPushed(int no) {
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    public void offBtnPushed(int no) {
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    public void undoBtnPushed() {
        undoCommand.undo();
    }

}
