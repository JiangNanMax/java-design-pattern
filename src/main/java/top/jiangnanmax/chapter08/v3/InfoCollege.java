package top.jiangnanmax.chapter08.v3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author jiangnan
 * @description InfoCollege
 * @date 2020/3/24
 **/

public class InfoCollege implements College {

    String name;
    List<Department> departments;

    public InfoCollege(String name) {
        this.name = name;
        this.departments = new ArrayList<Department>();
    }

    public String getName() {
        return name;
    }

    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        this.departments.add(department);
    }

    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
