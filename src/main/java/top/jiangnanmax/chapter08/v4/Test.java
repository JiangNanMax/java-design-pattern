package top.jiangnanmax.chapter08.v4;

/**
 * @author jiangnan
 * @description Test
 * @date 2020/3/25
 **/

/*
    JDK容器的迭代器遍历技术已经很完善了，从中可以体会到很多迭代器技术的特点

    这里为了更好的理解迭代器技术，抛开JDK已有的接口和类，自行设计不同类型的
容器类以及迭代器类
 */
public class Test {

    public static void traverse(MyCollection c) {
        MyIterator iterator = c.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        MyCollection c = new MyArrayList(5);
        for (int i = 0; i < 10; i++) {
            c.add("array " + i);
        }
        traverse(c);
    }

}
