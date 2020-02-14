package top.jiangnanmax.chapter05.v2;

/**
 * @author jiangnan
 * @description Address
 * @date 2020/2/14
 **/

public class Address implements Cloneable {
    String province;
    String city;
    String zip;

    public Address(String province, String city, String zip) {
        this.province = province;
        this.city = city;
        this.zip = zip;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    // 用于深复制
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
