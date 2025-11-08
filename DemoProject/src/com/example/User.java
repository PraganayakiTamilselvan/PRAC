package com.example;

import java.util.Scanner;

public class User {
    public static void main(String[] args) throws insufficientBalanceException {
        Scanner sc = new Scanner(System.in);
        int balance= sc.nextInt();
        int am= sc.nextInt();
        if(balance <am) {
        	throw new insufficientBalanceException("WITHDRAW AMOUNT MUST BE LESS THAN BALANCE");
        }
        else {
        	System.out.println("Successfull withdraw");
        }
        
    }
}