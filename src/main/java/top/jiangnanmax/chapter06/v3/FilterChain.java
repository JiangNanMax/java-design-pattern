package top.jiangnanmax.chapter06.v3;

import java.util.ArrayList;

/**
 * @author jiangnan
 * @description FilterChain
 * @date 2020/2/26
 **/

public class FilterChain implements Filter {
    ArrayList<Filter> arr = new ArrayList<Filter>();
    int index = 0;

    void addFilter(Filter filter) {
        arr.add(filter);
    }

    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if (index >= arr.size()) {
            return ;
        }

        Filter filter = arr.get(index);
        index++;
        filter.doFilter(request, response, filterChain);
    }
}
