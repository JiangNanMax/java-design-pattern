package top.jiangnanmax.chapter06.v1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author jiangnan
 * @description Test
 * @date 2020/2/16
 **/

public class Test {
    public static void main(String[] args) {
        Request request = new Request(6);
        MyChain myChain = new MyChain();
        myChain.createChain();
        myChain.handle(request);
    }
}

/*
        很明显，上述代码所形成的责任链过于刚性，
    若需求发生了变化，则必须修改MyChain类。

        更加灵活的方法，具体见v2，结合使用
    配置文件 + 反射
 */