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
/*
    讨论：
        从本示例中FilterChain类的doFilter方法可以看到，它实现
    的其实是同步回调。若具体处理者花费时间很长，则应用程序就不能
    执行其他功能了。当然，可以利用多线程来实现异步回调，就能解决
    该问题，后续进行实现。
 */
