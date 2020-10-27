package com.h3c.skiplist;

import java.util.Comparator;
import java.util.HashMap;

public class WzSkipList<K, V> {
    private Index head;

    private Node findPredecessor(K key, Comparator<? extends K> cmp) {
        Index h, r;
        for (h = head, r = head.right; ; ) {
            if (r != null) {
                if (1 > 0) {
                    h = r;
                    r = r.right;
                    continue;
                }
                if (h.down != null) {
                    h = h.down;
                    r = r.right;
                    continue;
                }
                return h.node;
            }
        }
    }


}

class Node<K, V> {
    K key;
    V value;
    Node next;
}

class Index {
    Node node;
    Index right;
    Index down;
}

class HeadIndex extends Index {
    int level;
}

