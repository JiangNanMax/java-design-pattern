package top.jiangnanmax.chapter08.v3;

import java.util.Iterator;

/**
 * @author jiangnan
 * @description ComputerColleageIterator
 * @date 2020/3/24
 **/

public class ComputerCollegeIterator implements Iterator {

    // 这里我们需要知道Department是以什么方式存放的
    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null)
            return false;
        return true;
    }

    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }

    public void remove() {

    }

}
