package top.jiangnanmax.chapter05.v1;

/**
 * @author jiangnan
 * @description Student
 * @date 2020/2/13
 **/

public class Student {
    String name;
    int age;
    Address address;

    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    // 利用构造函数方法

    // 1、浅复制
    /*
    public Student(Student student) {
        this.name = student.getName();
        this.age = student.getAge();
        this.address = student.getAddress();
    }
     */

    // 2、深复制
    public Student(Student student) {
        this.name = student.getName();
        this.age = student.getAge();
        this.address = new Address(student.getAddress());
    }

}
