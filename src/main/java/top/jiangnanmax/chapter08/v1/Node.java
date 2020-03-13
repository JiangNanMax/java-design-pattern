package top.jiangnanmax.chapter08.v1;

/**
 * @author jiangnan
 * @description Node
 * @date 2020/3/13
 **/

public class Node<T> {
    T t;
    Node next;

    public Node(T t) {
        this.t = t;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public T getT() {
        return t;
    }
}
