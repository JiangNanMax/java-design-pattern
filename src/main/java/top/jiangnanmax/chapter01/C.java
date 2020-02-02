package top.jiangnanmax.chapter01;

import java.lang.reflect.*;

/**
 * @author jiangnan
 * @description C
 * @date 2020/1/8
 **/

// 例1-3 统一形式调用成员方法

public class C {

    public void func1() {
        System.out.println("This is func1: ");
    }

    public void func2(Integer m) {
        System.out.println("This is func2: " + m);
    }

    public void func3(String s, Integer m) {
        System.out.println("This is func3: " + m + s);
    }

    public static void main(String[] args) throws Exception {
        Class classInfo = Class.forName("top.jiangnanmax.chapter01.C");

        // 调用无参构造函数，生成新的实例对象
        Object obj = classInfo.getConstructor().newInstance();

        // 调用无参成员函数func1
        Method mt1 = classInfo.getMethod("func1");
        mt1.invoke(obj);

        // 调用1个参数成员函数func2
        Method mt2 = classInfo.getMethod("func2", Integer.class);
        mt2.invoke(obj, new Object[]{10});

        // 调用2个参数成员函数func3
        Method mt3 = classInfo.getMethod("func3", String.class, Integer.class);
        mt3.invoke(obj, new Object[]{"hello", 2020});

        Process("top.jiangnanmax.chapter01.C", "func2", new Object[]{10});

    }

    // 例1-4 通用方法
    // 补充，应该对para数组进行一定的判断工作
    static boolean Process(String className, String funcName, Object[] para) throws Exception {
        // 获取类信息对象
        Class classInfo = Class.forName(className);

        // 形成函数参数序列
        Class c[] = new Class[para.length];
        for (int i = 0; i < para.length; i++) {
            c[i] = para[i].getClass();
        }

        // 调用无参构造函数
        Constructor ct = classInfo.getConstructor();
        Object obj = ct.newInstance();

        // 获得函数方法信息
        Method mt = classInfo.getMethod(funcName, c);
        // 执行方法
        mt.invoke(obj, para);

        return true;
    }

}









