package top.jiangnanmax.chapter06.v2;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author jiangnan
 * @description MyChain
 * @date 2020/2/22
 **/

public class MyChain {
    private Handler[] handlers;

    public void createChain() {
        try {
            String path = "/Users/jiangnan/IdeaProjects/java-design-pattern/src/main/java/top/jiangnanmax/chapter06/v2/config.txt";
            FileInputStream fileInputStream = new FileInputStream(path);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            String s = properties.getProperty("chain");
            String[] units = s.split(",");
            int len = units.length;
            handlers = new Handler[len];
            for (int i = 0; i < len; i++) {
                // 通过反射加载各类责任链对象
                handlers[i] = (Handler)Class.forName(units[i]).newInstance();
            }
            for (int i = 0; i < len - 1; i++) {
                handlers[i].setNext(handlers[i + 1]);
            }
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void handle(Request request) {
        handlers[0].handle(request);
    }
}
