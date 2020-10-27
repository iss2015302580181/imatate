package com.h3c.util;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class WzHashMap<K, V> {
    static class Node<K, V> {
        K key;
        V value;
        Node next;
    }
}

class WzLinkedHashMap<K, V> extends WzHashMap<K, V> {
    Entry<K, V> head, tail;

    static class Entry<K, V> extends WzHashMap.Node<K, V> {
        Entry<K, V> before, after;
    }

    void newNode(K key, V value) {
        Entry<K, V> entry = new Entry<>();
        if (head == null)
            head = tail = entry;
        else {
            tail.after = entry;
            entry.before = tail;
            tail = tail.after;
        }
    }
}
