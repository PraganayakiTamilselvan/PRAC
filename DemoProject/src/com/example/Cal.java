package com.example;
import java.util.Calendar;
public class Cal {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int day = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH) + 1; // Months are 0-based
        int year = c.get(Calendar.YEAR);
        System.out.println("Current Date: " + day + "/" + month + "/" + year);
    }
}

