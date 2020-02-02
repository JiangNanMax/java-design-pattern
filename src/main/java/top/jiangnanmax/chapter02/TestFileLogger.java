package top.jiangnanmax.chapter02;

/**
 * @author jiangnan
 * @description TestFileLogger
 * @date 2020/1/16
 **/

public class TestFileLogger {

    public static void main(String[] args) {
        FileLogger obj = FileLogger.getInstance();
        obj.write("hello");
        obj.write("你好");
        obj.close();
    }

}
