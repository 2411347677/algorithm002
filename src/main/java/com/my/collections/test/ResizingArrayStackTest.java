package com.my.collections.test;

import com.my.collections.Stack;
import com.my.collections.imp.ResizingArrayStack;
import edu.princeton.cs.algs4.StdIn;

import java.util.Iterator;

public class ResizingArrayStackTest {
    public static void main(String[] args) {
        Stack<String> stack = new ResizingArrayStack();
        while (!StdIn.isEmpty()){
            String item = StdIn.readString();
            if(!item.equals("-"))
                stack.push(item);
            else if(stack.size()>0)
                System.out.println(stack.pop());
            else
                System.out.println("stack is empty");
        }
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
