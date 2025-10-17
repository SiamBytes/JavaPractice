

package com.javapractice;

public class ReverseStringPreserveSpaces {
    public static void main(String[] args) {
        String input = "I am QA Tester";
        char[] str = input.toCharArray();
        char[] result = new char[str.length];

        // Mark spaces in the result
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                result[i] = ' ';
            }
        }

        int j = str.length - 1;
        for (int i = 0; i < str.length; i++) {
            if (str[i] != ' ') {
                if (result[j] == ' ') j--;
                result[j] = str[i];
                j--;
            }
        }

        System.out.println("Input:  " + input);
        System.out.println("Output: " + String.valueOf(result));
    }
}

