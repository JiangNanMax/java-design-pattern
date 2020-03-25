package top.jiangnanmax.chapter08.v4;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author jiangnan
 * @description MyArrayList
 * @date 2020/3/25
 **/

public class MyArrayList implements MyCollection {

    private Object[] elementData;
    private int size;

    public MyArrayList(int size) {
        elementData = new Object[size];
        this.size = 0;
    }

    public void add(Object o) {
        if (this.size == elementData.length) {
            int newSize = this.size * 2;
            elementData = Arrays.copyOf(elementData, newSize);
        }
        elementData[size] = o;
        size++;
    }

    public int size() {
        return this.size;
    }

    public MyIterator iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements MyIterator {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public Object next() {
            Object o = elementData[currentIndex];
            currentIndex++;
            return o;
        }
    }
}
