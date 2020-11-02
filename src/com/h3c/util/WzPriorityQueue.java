package com.h3c.util;

public class WzPriorityQueue<E> {

    int size;
    private E[] tab;

    public boolean offer(E e) {
        tab[size++] = e;
        siftUp(e);

        return true;
    }

    public E poll() {
        E result = tab[0];
        siftDown();
        return result;
    }

    private void siftUp(E e) {
        int i = size - 1;
        while (i > 0) {
            int p = (i - 1) / 2;
            Comparable c = (Comparable) tab[i];
            if (c.compareTo((E) tab[p]) < 0) {
                tab[i] = tab[p];
            } else {
                break;
            }
            i = p;
        }
        if (i != size - 1) {
            tab[i] = e;
        }
    }

    private void siftDown() {
        tab[0] = tab[--size];
        int i = 0;
        while (i < size) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left < size && right < size) {

            }
        }
    }
}
