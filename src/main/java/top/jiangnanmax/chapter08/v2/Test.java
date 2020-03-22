package top.jiangnanmax.chapter08.v2;

import java.util.*;

/**
 * @author jiangnan
 * @description Test
 * @date 2020/3/22
 **/

/*
    JDK中迭代器模式是很成熟的，它
 */
public class Test {

    public static void traverse(Collection<String> c) {
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("aaa");
        vector.add("bbb");
        vector.add("ccc");
        System.out.println("traverse Vector:");
        traverse(vector);
        System.out.println();

        LinkedList<String> list = new LinkedList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println("traverse LinkedList:");
        traverse(list);
        System.out.println();

        Set<String> set = new HashSet<String>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        System.out.println("traverse Set:");
        traverse(list);
        System.out.println();

    }

}
