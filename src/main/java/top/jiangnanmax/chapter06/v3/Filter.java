package top.jiangnanmax.chapter06.v3;

/**
 * @author jiangnan
 * @description Filter
 * @date 2020/2/26
 **/

public interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);
}
