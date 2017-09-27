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

    MyArrayDeque(int capacity) throws MyConstructorException{
        my = new ArrayDeque<>(capacity);
        size = capacity;
        if (capacity <1) {
            throw new MyConstructorException("The digit can not be <1");
        }
    }

    void add(int object) {
        if (my.size() < size)
            my.add(object);
        else {
            int delete = my.pollFirst();
            my.addLast(object);
        }
    }

    int size(){
        return size;
    }

    @Override
    public String toString() {
        for (int element:my){
            System.out.print(String.valueOf(element)+ " ");
        }
        return "";
    }
}
