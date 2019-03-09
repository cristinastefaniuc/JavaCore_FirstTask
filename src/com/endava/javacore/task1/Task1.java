package com.endava.javacore.task1;

public class Task1 {

    public static int sumUpDigits(int number) {
        int sum = 0;
        while(number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        return sum;
    }
}
