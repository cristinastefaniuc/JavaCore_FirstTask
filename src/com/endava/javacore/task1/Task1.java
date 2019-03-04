package com.endava.javacore.task1;

public class Task1 {

    public static int sumUpDigits(int number) {
        int sum = 0, remainder = 0;
        while(number > 0) {
            remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }

        return sum;
    }
}
