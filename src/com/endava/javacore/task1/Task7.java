package com.endava.javacore.task1;

import java.util.ArrayList;
import java.util.List;

public class Task7 {

    public static void method(Object []arr) {
        StringBuilder concatenatedStr = new StringBuilder();
        double sum = 0;
        List<Person> personsList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof String || arr[i] instanceof Character) {
                concatenatedStr.append(arr[i] + " ");
            } else if (arr[i] instanceof Integer) {
                sum = sum + Double.valueOf((int)arr[i]);
            } else if (arr[i] instanceof Double) {
                sum = sum + (double)arr[i];
            } else if (arr[i] instanceof Person){
                personsList.add((Person) arr[i]);
            }
        }

        System.out.println("Result: ");
        System.out.println("Concatenation of strings and characters: \" " + concatenatedStr + "\"");
        System.out.println("Sum of all numbers: " + sum);
        System.out.print("Array of Persons: ");
        for (Person p: personsList) {
            System.out.print(p.getName() + ", ");
        }
    }
}
