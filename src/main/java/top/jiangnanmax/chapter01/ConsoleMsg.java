package top.jiangnanmax.chapter01;

/**
 * @author jiangnan
 * @description ConsoleMsg
 * @date 2020/1/8
 **/

public class ConsoleMsg implements IMsg {

    public void process(String s) {
        System.out.println(s);
    }
}
