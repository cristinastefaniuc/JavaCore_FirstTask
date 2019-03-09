package com.endava.javacore.task1;

public class Task3 {

    public static StringBuilder reverseStr(String str) {
        StringBuilder reversedStr = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }
        return reversedStr;
    }
}
