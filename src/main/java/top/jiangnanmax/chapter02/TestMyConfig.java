package top.jiangnanmax.chapter02;

/**
 * @author jiangnan
 * @description TestMyConfig
 * @date 2020/1/16
 **/

public class TestMyConfig {

    public static void main(String[] args) {
        MyConfig mc = MyConfig.getInstance();
        String url = mc.getInfo("url");
        String user = mc.getInfo("username");
        String pwd = mc.getInfo("password");
        System.out.println("url= " + url);
        System.out.println("username= " + user);
        System.out.println("password= " + pwd);
    }

}
