package com.company;

import java.util.ArrayDeque;
import java.util.Deque;


public class MyArrayDeque {
     private Deque<Integer> my;
     private int size;

    MyArrayDeque(){
        my = new ArrayDeque<>(3);
        size = 16;
    }

    MyArrayDeque(int capacity){
        my = new ArrayDeque<>(capacity);
        size = capacity;
    }

    void add(int object) {
        if (my.size() < size)
            my.add(object);
        else {
            int delete = my.pollFirst();
            my.addLast(object);
        }
    }

    @Override
    public String toString() {
        for (int element:my){
            System.out.print(String.valueOf(element)+ " ");
        }
        return "";
    }
}
