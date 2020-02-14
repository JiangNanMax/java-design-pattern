package top.jiangnanmax.chapter05.v3;

import top.jiangnanmax.chapter05.v1.Address;
import top.jiangnanmax.chapter05.v1.Student;

/**
 * @author jiangnan
 * @description Test
 * @date 2020/2/14
 **/

public class Test {
    public static void main(String[] args) {
        // 测试深复制
        top.jiangnanmax.chapter05.v1.Address address = new Address("fujian", "xiamen", "361102");
        top.jiangnanmax.chapter05.v1.Student s = new top.jiangnanmax.chapter05.v1.Student("jiangnan", 22, address);
        top.jiangnanmax.chapter05.v1.Student s2 = new Student(s);

        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);
    }
}
