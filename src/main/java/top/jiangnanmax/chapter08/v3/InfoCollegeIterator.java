package top.jiangnanmax.chapter08.v3;

import java.util.Iterator;
import java.util.List;

/**
 * @author jiangnan
 * @description InfoCollegeIterator
 * @date 2020/3/24
 **/

public class InfoCollegeIterator implements Iterator {

    List<Department> departments;
    int index = 0;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    public boolean hasNext() {
        if (index >= departments.size() || departments.get(index) == null)
            return false;
        return true;
    }

    public Object next() {
        Department department = departments.get(index);
        index++;
        return department;
    }

    public void remove() {

    }
}
