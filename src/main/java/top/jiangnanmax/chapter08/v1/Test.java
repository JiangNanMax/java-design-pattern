package top.jiangnanmax.chapter08.v1;

/**
 * @author jiangnan
 * @description Test
 * @date 2020/3/13
 **/

public class Test {
    public static void main(String[] args) {
        Student[] s = new Student[2];
        s[0] = new Student("1000", "zhang");
        s[1] = new Student("1001", "li");

        MyArray<Student> arr = new MyArray<Student>(s);
        for (int i = 0; i < arr.size(); i++) {
            Student tmp = arr.get(i);
            System.out.println(tmp);
        }

        Student[] u = new Student[3];
        u[0] = new Student("2000", "zhao");
        u[1] = new Student("2001", "qian");
        u[2] = new Student("2002", "sun");

        Node<Student> n0 = new Node<Student>(u[0]);
        Node<Student> n1 = new Node<Student>(u[1]);
        Node<Student> n2 = new Node<Student>(u[2]);
        n0.setNext(n1);
        n1.setNext(n2);

        MyLink<Student> link = new MyLink<Student>(n0);
        Node<Student> cur = link.getHead();
        while (cur != null) {
            Student tmp = cur.getT();
            System.out.println(tmp);
            cur = cur.getNext();
        }

    }
}
/*
    从上述测试程序可以看到，遍历数组与链表
的方式是不同的，从遍历的具体代码就可以看出
不同类型容器的具体特点。
    那么是否能有一种容器元素遍历方式，对各
种容器而言都是一致的，且与容器的性质无关呢？

 */
