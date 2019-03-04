package com.endava.javacore.task1;

import java.util.Scanner;

public class Main {

    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        ///////Task1
        System.out.println("---------Task1---------");
        int number;

        do {
            System.out.print("Input an integer between 0 and 1000: ");
            number = scanner.nextInt();
        } while (number < 0 || number > 1000);

        System.out.println("The sum of all digits in " + number + " is " + Task1.sumUpDigits(number));

        ///////Task2
        System.out.println("\n---------Task2---------");
        System.out.print("Input 1st integer: ");
        int int1 = scanner.nextInt();
        System.out.print("Input 2nd integer: ");
        int int2 = scanner.nextInt();

        System.out.println("Sum of two integers: " + Task2.sumOfIntegers(int1, int2));
        System.out.println("Difference of two integers: " + Task2.differenceOfIntegers(int1, int2));
        System.out.println("Product of two integers: " + Task2.productOfIntegers(int1, int2));
        System.out.println("Average of two integers: " + Task2.averageOfIntegers(int1, int2));
        System.out.println("Distance of two integers: " + Math.abs((Task2.differenceOfIntegers(int1, int2))));
        System.out.println("Max integer: " + Task2.maxOfIntegers(int1, int2));
        System.out.println("Min integer: " + Task2.minOfIntegers(int1, int2));

        ///////Task3
        System.out.println("\n---------Task3---------");
        System.out.print("Input a string: ");
        scanner.nextLine();
        String str = scanner.nextLine();
        System.out.println("Reverse string: " + Task3.reverseStr(str));

        ///////Task4
        System.out.println("\n---------Task4---------");
        System.out.print("Input a word: ");
        String word = scanner.next();
        System.out.print("Is this word a palindrome? - " + Task4.isPalindrome(word));

        ///////Task5
        System.out.println("\n\n---------Task5---------");
        System.out.print("Input a string: ");
        scanner.nextLine();
        String str1 = scanner.nextLine();
        Task5.count(str1);

        ///////Task6
        System.out.println("\n---------Task6---------");
        Task6.divideBy3();
        Task6.divideBy5();
        Task6.divideBy3And5();

        ///////Task7
        System.out.println("\n\n---------Task7---------");
        Object []arr = {"Today", new Person("Igor", 26, 'm'),  3234.0, "is", 23, 652, 'a', new Person("Ann", 23, 'f'), "big", "day"};
        Task7.method(arr);
    }
}
