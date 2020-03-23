package com.my.collections.task;

import com.my.collections.Stack;
import com.my.collections.imp.LinkedStack;
import edu.princeton.cs.algs4.StdIn;

public class StackTask001 {
    public static void main(String[] args) {
        Stack<Character> stack = new LinkedStack<Character>();
            String item = StdIn.readString();
            for (int i=0;i<item.length();i++){
                if(item.charAt(i)=='('||item.charAt(i)=='{'||item.charAt(i)=='['){
                    stack.push(item.charAt(i));
                }else if((item.charAt(i)==')'&&stack.peek()=='(')||(item.charAt(i)=='}'&&stack.peek()=='{')
                        ||(item.charAt(i)==']'&&stack.peek()=='[')){
                        stack.pop();
                }
            }
        boolean flag = false;
        if(stack.size()==0)
            flag = true;
        System.out.println(flag);
    }
}
