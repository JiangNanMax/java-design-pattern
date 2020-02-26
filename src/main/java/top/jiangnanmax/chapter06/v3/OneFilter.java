package top.jiangnanmax.chapter06.v3;

/**
 * @author jiangnan
 * @description OneFilter
 * @date 2020/2/26
 **/

public class OneFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String s = request.value;
        response.value = s.toUpperCase();
        filterChain.doFilter(request, response, filterChain);
    }
}
