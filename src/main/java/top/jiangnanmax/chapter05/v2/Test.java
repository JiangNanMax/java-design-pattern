package top.jiangnanmax.chapter05.v2;


/**
 * @author jiangnan
 * @description Test
 * @date 2020/2/14
 **/

public class Test {
    public static void main(String[] args) throws Exception {
        // 测试浅复制
        Address address = new Address("fujian", "xiamen", "361102");
        Student s = new Student("jiangnan", 22, address);
        Student s2 = (Student)s.clone();

        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);
    }
}
