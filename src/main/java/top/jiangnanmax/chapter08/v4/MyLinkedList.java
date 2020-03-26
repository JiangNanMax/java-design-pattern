package top.jiangnanmax.chapter08.v4;

/**
 * @author jiangnan
 * @description MyLinkedList
 * @date 2020/3/26
 **/

public class MyLinkedList implements MyCollection {

    private Node head = null;
    private int size = 0;
    private Node tail = null;

    @Override
    public void add(Object o) {
        Node node = new Node(o);
        if (head == null) {
            head = node;
            tail = node;
            node.setNext(null);
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements MyIterator {

        private Node currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public Object next() {
            Node node = currentNode;
            currentNode = currentNode.getNext();
            return node.getData();
        }
    }

}
