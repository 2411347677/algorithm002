package com.my.collections.test;

import com.my.collections.Stack;
import com.my.collections.imp.FixedCapacityStack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class FixedCapacityStackTest {
    public static void main(String[] args) {
        Stack stack = new FixedCapacityStack(10);
        while(!StdIn.isEmpty()){
            String item = StdIn.readString();
            if(!item.equals("-"))
                stack.push(item);
            else if(stack.size()>0)
                StdOut.print(stack.pop()+" ");
        }
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
