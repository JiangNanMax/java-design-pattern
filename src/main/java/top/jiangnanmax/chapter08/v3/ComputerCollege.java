package top.jiangnanmax.chapter08.v3;

import java.util.Iterator;

/**
 * @author jiangnan
 * @description ComputerCollege
 * @date 2020/3/24
 **/

public class ComputerCollege implements College {

    String name;
    Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege(String name, int sizes) {
        this.name = name;
        this.departments = new Department[sizes];
    }

    public String getName() {
        return name;
    }

    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        this.departments[numOfDepartment] = department;
        this.numOfDepartment++;
    }

    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
