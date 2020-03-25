package top.jiangnanmax.chapter08.v4;

/**
 * @author jiangnan
 * @description MyCollection
 * @date 2020/3/25
 **/

public interface MyCollection {
    void add(Object o);
    int size();
    MyIterator iterator();
}
