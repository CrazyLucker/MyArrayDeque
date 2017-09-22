package com.company;


public class Main {

    public static void main(String[] args) {
        MyArrayDeque my = new MyArrayDeque();
        my.add(5);
        my.add(3);
        my.add(2);
        System.out.println(my);
        my.add(10);
        System.out.println(my);
        my.add(13);
        System.out.println(my);
    }
}
