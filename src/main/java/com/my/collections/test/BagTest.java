package com.my.collections.test;

import com.my.collections.imp.Bag;
import edu.princeton.cs.algs4.StdIn;

import java.util.Iterator;

public class BagTest {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();
        while (!StdIn.isEmpty()){
            String item = StdIn.readString();
            bag.add(item);
        }
        Iterator<String> iterator = bag.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
