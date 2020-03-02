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
/*
    感觉这个例子有点不太规范
    继续用一个遥控器的例子来加深理解，具体看v2
 */
