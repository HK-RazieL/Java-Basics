package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareCharArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr1 = reader.readLine().split("\\s");
        String[] arr2 = reader.readLine().split("\\s");

        int length = Math.min(arr1.length, arr2.length);

        for (int i = 1; i <= length; i++) {
            String firstLetterOne = arr1[i-1];
            String firstLetterTwo = arr2[i-1];

            int result = firstLetterOne.compareTo(firstLetterTwo);

            if (result != 0) {
                if (result < 0) {
                    System.out.printf("%s%n",String.join("", arr1));
                    System.out.printf("%s%n",String.join("", arr2));
                    break;
                } else {
                    System.out.printf("%s%n",String.join("", arr2));
                    System.out.printf("%s%n",String.join("", arr1));
                    break;
                }
            } else if (result == 0 && i == length){
                if (arr1.length >= arr2.length) {
                    System.out.printf("%s%n",String.join("", arr2));
                    System.out.printf("%s%n",String.join("", arr1));
                } else {
                    System.out.printf("%s%n",String.join("", arr1));
                    System.out.printf("%s%n",String.join("", arr2));
                }
            }
        }
    }
}

