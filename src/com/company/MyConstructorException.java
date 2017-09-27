package com.company;

public class MyConstructorException extends Exception {
    @Override
    public String toString() {
        return "The capacity can not be <1";
    }

    MyConstructorException(String message) {
        super(message);
    }
}
