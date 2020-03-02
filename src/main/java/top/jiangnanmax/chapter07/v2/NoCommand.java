package top.jiangnanmax.chapter07.v2;

/**
 * @author jiangnan
 * @description NoCommand
 * @date 2020/3/2
 **/

// 空指令，用于初始化
// 可省略空的判断逻辑
public class NoCommand implements Command {
    public void execute() {

    }

    public void undo() {

    }
}
