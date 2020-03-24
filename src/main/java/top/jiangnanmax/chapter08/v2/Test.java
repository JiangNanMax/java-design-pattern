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
/*
    我们知道：Vector容器的特点是内存空间是线性的、连续的；
LinkedList容器的特点是链式结构；Set容器的特点是树形结构。
虽然这三类容器的特点不同，但却是调用相同的遍历方法traverse()
完成了容器中元素的遍历，因此我们可以从结果中反向推导出结论：采
用迭代器设计模式后，容器的元素遍历与具体的容器是无关的。

 */
