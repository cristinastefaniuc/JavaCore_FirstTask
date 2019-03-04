package com.endava.javacore.task1;

public class Task4 {

    public static boolean isPalindrome(String word) {
        int leftSide = 0;
        int rightSide = word.length() - 1;
        while (rightSide > leftSide) {
            if(word.charAt(leftSide) != word.charAt(rightSide))
                return false;
        }
        return true;
    }
}
