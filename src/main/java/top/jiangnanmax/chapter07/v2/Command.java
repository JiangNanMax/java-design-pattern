package top.jiangnanmax.chapter07.v2;

/**
 * @author jiangnan
 * @description Command
 * @date 2020/3/1
 **/

// 命令接口
public interface Command {
    // 执行动作
    void execute();

    // 撤销动作
    void undo();
}
