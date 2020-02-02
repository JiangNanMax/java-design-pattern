package top.jiangnanmax.chapter01;

/**
 * @author jiangnan
 * @description FileMsg
 * @date 2020/1/8
 **/

public class FileMsg implements IMsg {

    public void process(String s) {
        System.out.println("Save msg to File.");
    }
}
