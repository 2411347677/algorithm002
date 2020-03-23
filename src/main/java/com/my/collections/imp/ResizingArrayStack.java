package com.my.collections.imp;

import com.my.collections.Stack;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Stack<Item>,Iterable<Item> {
    private Item[] a = (Item[]) new Object[1];
    private int N;
    private void resize(int max){
        Item[] temp = (Item[]) new Object[max];
        for(int i=0;i<a.length;i++)
            temp[i] = a[i];
        a = temp;
    }

    @Override
    public void push(Item item) {
        if(N==a.length)
            resize(a.length+1);
        a[N++]=item;
    }

    @Override
    public Item pop() {
        Item item = a[--N];
        a[N] = null;
        if(N>0&&N<a.length/4)
            resize(a.length-1);
        return item;
    }

    @Override
    public Item peek() {
        return a[N-1];
    }

    @Override
    public boolean isEmpty() {
        return N==0;
    }

    @Override
    public int size() {
        return N;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ResizingArrayStackIterator();
    }

    private class ResizingArrayStackIterator implements Iterator<Item>{

        int i = N;
        @Override
        public boolean hasNext() {
            return i>0;
        }

        @Override
        public Item next() {
            return a[--i];
        }
    }
}
