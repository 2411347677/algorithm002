package com.my.collections.test;

import com.my.collections.imp.Queue;
import edu.princeton.cs.algs4.StdIn;

import java.util.Iterator;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        while (!StdIn.isEmpty()){
            String item = StdIn.readString();
            if(!item.equals("-"))
                queue.enQueue(item);
            else if(queue.size()>0)
                System.out.println(queue.deQueue());
            else System.out.println("queue is empty");
        }
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
