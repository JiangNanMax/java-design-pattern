package top.jiangnanmax.chapter04.v5;

import javax.swing.*;

/**
 * @author jiangnan
 * @description UIBuilder
 * @date 2020/2/12
 **/

public abstract class UIBuilder {
    protected JPanel panel = new JPanel();

    public abstract void addUI();                           // 形成界面
    public abstract void registerMsg();                     // 注册消息
    public abstract void initialData(String id);     // 初始化界面数据
    public JPanel getPanel() {
        return panel;                                       // 返回界面对象
    }
}
