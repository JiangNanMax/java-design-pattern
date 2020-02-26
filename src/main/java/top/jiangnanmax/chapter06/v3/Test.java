package top.jiangnanmax.chapter06.v3;

/**
 * @author jiangnan
 * @description Test
 * @date 2020/2/26
 **/

public class Test {
    public static void main(String[] args) {
        Request request = new Request("i am jiangnanmax");
        Response response = new Response("");
        Filter one = new OneFilter();
        Filter two = new TwoFilter();
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(one);
        filterChain.addFilter(two);
        filterChain.doFilter(request, response, filterChain);
        System.out.println(response.value);
    }
}
