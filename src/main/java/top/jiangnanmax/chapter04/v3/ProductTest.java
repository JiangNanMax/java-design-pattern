package top.jiangnanmax.chapter04.v3;

/**
 * @author jiangnan
 * @description ProductTest
 * @date 2020/2/10
 **/

public class ProductTest {
    public static void main(String[] args) {
        Product p = new Product.Builder().productName("xxx").companyName("sss").part("aaa").build();
        System.out.println(p);
    }
}
/*
    Spring源码中的应用：
        RequestMappingInfo
        BeanDefinitionBuilder
 */

/*
    还有一种建造者模式的实现方法
    利用Product派生类方法，也可以实现类似的生成器功能
    具体见v4
 */