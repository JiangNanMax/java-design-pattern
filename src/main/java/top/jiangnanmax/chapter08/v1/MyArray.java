package top.jiangnanmax.chapter08.v1;

/**
 * @author jiangnan
 * @description MyArray
 * @date 2020/3/13
 **/

public class MyArray<T> {
    private T[] t;

    public MyArray(T[] t) {
        this.t = t;
    }

    public T get(int n) {
        if (n < t.length)
            return t[n];
        return null;
    }

    public int size() {
        return  t.length;
    }
}
