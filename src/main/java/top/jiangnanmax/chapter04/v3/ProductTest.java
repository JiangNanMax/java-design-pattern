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
