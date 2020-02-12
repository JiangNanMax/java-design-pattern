package top.jiangnanmax.chapter04.v5;

import javax.swing.*;

/**
 * @author jiangnan
 * @description Director
 * @date 2020/2/12
 **/

public class Director {
    private UIBuilder builder;
    public Director(UIBuilder builder) {
        this.builder = builder;
    }
    public JPanel build(String accountNo) {
        builder.addUI();
        builder.registerMsg();
        builder.initialData(accountNo);
        return builder.getPanel();
    }
}
