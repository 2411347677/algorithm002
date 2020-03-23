package com.my.collections.imp;


import com.my.collections.Stack;

import java.util.Iterator;

public class LinkedStack<Item> implements Iterable<Item>, Stack<Item> {
    private class Node{//定义结点类
        Item item;
        Node next;
    }

    private Node first;//栈顶指针（引用）

    private int N;//栈元素个数


    public void push(Item item){
        Node oldFirst = first;//原栈顶的结点的引用
        first = new Node();//压入栈的元素的引用为新栈顶的引用
        first.item = item;//栈顶引用的数据域为新压入栈内的元素
        first.next = oldFirst;//栈顶引用的指针域指向下一个元素（连接上）
        N++;//栈元素个数加一
    }

    public Item pop(){
        Item item = first.item;//出栈
        first = first.next;//栈顶元素的引用变为下一个结点的引用
        N--;//栈元素减一
        return item;
    }

    @Override
    public Item peek() {
        return first.item;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        return N;
    }
    @Override
    public Iterator<Item> iterator() {

        return new StackIterator();
    }

    private class StackIterator implements Iterator<Item>{//遍历栈不能出栈

        private Node current = first;
        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {

        }
    }
}