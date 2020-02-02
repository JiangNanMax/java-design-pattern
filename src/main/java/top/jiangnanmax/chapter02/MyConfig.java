package top.jiangnanmax.chapter02;

import java.io.FileInputStream;
import java.util.*;

/**
 * @author jiangnan
 * @description MyConfig
 * @date 2020/1/16
 **/

public class MyConfig {

    private Map<String, String> map = new HashMap<String, String>();

    private MyConfig() {
        try {
            FileInputStream in = new FileInputStream("/Users/jiangnan/IdeaProjects/java-design-pattern/src/main/java/top/jiangnanmax/chapter02/config.txt");
            Properties p = new Properties();
            p.load(in);
            Set<Object> keys = p.keySet();
            Iterator it = keys.iterator();
            while (it.hasNext()) {
                String key = (String)it.next();
                String value = p.getProperty(key);
                map.put(key, value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class My {
        private static final MyConfig single = new MyConfig();
    }

    public static MyConfig getInstance() {
        return My.single;
    }

    public String getInfo(String key) {
        return map.get(key);
    }

}
