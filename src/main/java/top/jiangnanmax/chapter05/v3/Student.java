package top.jiangnanmax.chapter05.v3;

import java.io.*;

/**
 * @author jiangnan
 * @description Student
 * @date 2020/2/14
 **/

public class Student implements Cloneable, Serializable {
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

    // 关键代码，在此处实现对象的序列化和反序列化
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            // 写出到流
            oos.writeObject(this);
            // 从流里读出来
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            obj = ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;
    }
}
