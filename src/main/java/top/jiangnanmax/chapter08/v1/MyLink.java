package top.jiangnanmax.chapter08.v1;

/**
 * @author jiangnan
 * @description MyLink
 * @date 2020/3/13
 **/

public class MyLink<T> {
    Node<T> head;

    public MyLink(Node<T> head) {
        this.head = head;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getNext(Node<T> node) {
        return node.getNext();
    }
}
