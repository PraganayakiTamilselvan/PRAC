package com.example;

public class insufficientBalanceException extends Exception {
    public insufficientBalanceException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "InsufficientBalanceException: " + getMessage();
    }
}