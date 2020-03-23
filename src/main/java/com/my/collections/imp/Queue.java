package com.my.collections.imp;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {
    private class Node {
        Item item;
        Node next;
    }

    private int N;

    private Node first;

    private Node last;

    public boolean isEmpty() {
        return N == 0;
    }

    public void enQueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty())
            first = last;
        else oldLast.next = last;
        N++;
    }

    public Item deQueue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty())
            last = null;
        N--;
        return item;
    }

    public int size() {
        return N;
    }

    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
