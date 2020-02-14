package top.jiangnanmax.chapter05.v2;

/**
 * @author jiangnan
 * @description Student
 * @date 2020/2/14
 **/

public class Student implements Cloneable {
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

    // 浅复制
    /*
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
     */

    // 深复制
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student s = (Student)super.clone();
        s.setAddress((Address)address.clone());
        return s;
    }
}
