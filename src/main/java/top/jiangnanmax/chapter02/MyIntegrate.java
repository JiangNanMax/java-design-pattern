package top.jiangnanmax.chapter02;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @author jiangnan
 * @description MyIntegrate
 * @date 2020/2/2
 **/

public class MyIntegrate {
    private static Map<String, String> url2name = new HashMap<String, String>();
    private static Map<String, String> name2class = new HashMap<String, String>();
    private static Map<String, IFunc> physicsClass = new HashMap<String, IFunc>();
    private static final String packagePath = "top.jiangnanmax.chapter02.";

    public static void init() {
        try {
            FileInputStream in = new FileInputStream("/Users/jiangnan/IdeaProjects/java-design-pattern/src/main/java/top/jiangnanmax/chapter02/configForFunc.txt");
            Properties p = new Properties();
            p.load(in);
            Set<Object> keys = p.keySet();
            Iterator it = keys.iterator();
            while (it.hasNext()) {
                String key = (String)it.next();
                String value = p.getProperty(key);
                String[] unit = value.split(",");

                String url = key;
                String name = unit[0];
                String className = unit[1];

                url2name.put(url, name);
                name2class.put(name, packagePath + className);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void run() throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("please input url, or input quit to stop: ");
            String request = sc.nextLine();
            if (request.equals("quit")) break;
            String[] unit = request.split(" ");
            String url = unit[0];
            int param1 = Integer.parseInt(unit[1]);
            int param2 = Integer.parseInt(unit[2]);

            String name = url2name.get(url);
            IFunc obj = physicsClass.get(name);
            if (obj == null) {
                String className = name2class.get(name);
                Class c = Class.forName(className);
                Method m = c.getDeclaredMethod("getInstance");
                obj = (IFunc)m.invoke(null);
                physicsClass.put(name, obj);
            }
            int ans = obj.service(param1, param2);
            System.out.println("the result is: " + ans);
        }
    }

}
