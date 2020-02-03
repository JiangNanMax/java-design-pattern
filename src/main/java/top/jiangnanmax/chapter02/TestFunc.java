package top.jiangnanmax.chapter02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author jiangnan
 * @description TestFunc
 * @date 2020/2/2
 **/

public class TestFunc {

    public static void main(String[] args) {
        IFunc obj = PlusFunc.getInstance();     // 获得加单例对象
        IFunc obj2 = MinusFunc.getInstance();   //获得减单例对象

        Map<String, Object> name2obj = new HashMap<String, Object>();   // name与对对象形成映射
        name2obj.put("plus", obj);
        name2obj.put("minus", obj2);

        Map<String, String> url2name = new HashMap<String, String>();   // url与name形成映射
        url2name.put("plusurl", "plus");
        url2name.put("minusurl", "minus");

        Scanner s = new Scanner(System.in);
        while (true) {
            String url = s.nextLine();  // 输入形式，如：plusurl 3 5
            if (url.equals("quit")) break;
            String[] unit = url.split(" ");
            String name = url2name.get(unit[0]);
            IFunc i_obj = (IFunc)name2obj.get(name);
            int result = i_obj.service(Integer.parseInt(unit[1]), Integer.parseInt(unit[2]));
            System.out.println(result);

        }

    }

}
