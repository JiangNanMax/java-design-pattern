package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description IRead
 * @date 2020/2/7
 **/

public interface IRead<T> {
    T read(String... in);   // 定义泛型接口，并屏蔽参数个数差异
}
