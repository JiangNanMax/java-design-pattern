package top.jiangnanmax.chapter06.v3;

/**
 * @author jiangnan
 * @description TwoFilter
 * @date 2020/2/26
 **/

public class TwoFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String s = response.value;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                stringBuffer.append(c);
            }
        }
        response.value = stringBuffer.toString();
        filterChain.doFilter(request, response, filterChain);
    }
}
