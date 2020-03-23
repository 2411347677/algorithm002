package com.my.collections.task;

import com.my.collections.Stack;
import com.my.collections.imp.LinkedStack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class StackTask003 {
    public static void main(String[] args) {
        Stack<String> ops = new LinkedStack<>();  // 符号栈
        Stack<String> vals = new LinkedStack<>(); // 数值栈,由于不需要运算,参数类型使用String,而非double;

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();  // 读取字符串，每次一个，以空格隔开；

            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
                ops.push(s);
            else if (s.equals(")")) {
                // 此处，两边的括号是“）”、“（”，而非“（”、“）”；
                String expre = ")" + vals.pop() + ops.pop() + vals.pop() + "(";

                // 注意，整个表达式作为一个整体，也就是单个字符串压入栈顶；
                vals.push(expre);
            } else
                vals.push(s);
        }

        String result = vals.pop();
        // output: result: )))6-5(*)4-3((*)2+1((
        StdOut.println("result: " + result);

        // 更改逆序为顺序
        String seq = "";
        for (int i = result.length()-1; i >= 0; i--){
            seq += result.charAt(i);
        }

        // output: seq: ((1+2)*((3-4)*(5-6)))
        StdOut.println("seq: " + seq);
    }
}
