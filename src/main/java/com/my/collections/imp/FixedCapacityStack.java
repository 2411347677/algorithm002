package com.my.collections.imp;

import com.my.collections.Stack;

import java.util.Iterator;

public class FixedCapacityStack implements Stack<String>,Iterable<String> {

    private String[] a;//容量

    private int N;//当前长度

    public FixedCapacityStack(int cap){
        a = new String[cap];
    }
    @Override
    public void push(String item) {
        a[N++] = item;
    }

    @Override
    public String pop() {
        return a[--N];
    }

    @Override
    public String peek() {
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
    public Iterator<String> iterator() {
        return new FixedCapacityStackIterator();
    }

    private class FixedCapacityStackIterator implements Iterator<String>{

        private int i = N;
        @Override
        public boolean hasNext() {
            return i>0;
        }

        @Override
        public String next() {
                return a[--i];
        }
    }
}
