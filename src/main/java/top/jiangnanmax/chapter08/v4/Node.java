package top.jiangnanmax.chapter08.v4;

/**
 * @author jiangnan
 * @description Node
 * @date 2020/3/26
 **/

public class Node {

    private Object data;
    private Node next;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
