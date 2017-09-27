package com.company;

public class MyConstructorException extends Exception {
    @Override
    public String getMessage() {
        return "The digit can not be <1";
    }

    MyConstructorException(String message) {
        super(message);
    }
}
