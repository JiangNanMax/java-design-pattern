package top.jiangnanmax.chapter07.v1;

/**
 * @author jiangnan
 * @description Test
 * @date 2020/3/1
 **/

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher(student);
        Invoke invoke = new Invoke(teacher);
        invoke.execute();
    }
}
