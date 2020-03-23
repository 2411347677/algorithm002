package com.my.collections.task;

import com.my.collections.Stack;
import com.my.collections.imp.LinkedStack;
import edu.princeton.cs.algs4.StdIn;

public class StackTask002 {
    public static void main(String[] args) {
        Stack<Integer> stack = new LinkedStack<>();
        int N = StdIn.readInt();
        while (N>0){
            stack.push(N % 2);
            N/=2;
        }
        for(int i:stack){
            System.out.print(i);
        }
    }
}
