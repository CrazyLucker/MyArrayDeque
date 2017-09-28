package com.company;


public class Main {

    public static void main(String[] args) {
        MyArrayDeque my = null;
        try {
            my = new MyArrayDeque(-10);
        } catch (MyConstructorException e) {
            System.out.println(e.toString());
        }
    }
}
