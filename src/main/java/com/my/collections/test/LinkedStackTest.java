package com.my.collections.test;

import com.my.collections.imp.LinkedStack;
import com.my.collections.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class LinkedStackTest {
    public static void main(String[] args) {
        Stack<String> s = new LinkedStack<>();
        while (!StdIn.isEmpty()){
            String item = StdIn.readString();
            if(!item.equals("-"))
                s.push(item);
            else if(!s.isEmpty())
                StdOut.print(s.pop()+" ");
        }
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        StdOut.println("("+s.size()+" left on stack)");
    }
}
