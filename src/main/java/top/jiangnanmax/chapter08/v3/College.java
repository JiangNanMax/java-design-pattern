package top.jiangnanmax.chapter08.v3;

import java.util.Iterator;

/**
 * @author jiangnan
 * @description College
 * @date 2020/3/24
 **/

public interface College {

    String getName();

    void addDepartment(String name, String desc);

    Iterator createIterator();

}
