package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IndexOfLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine().toLowerCase();

        char[] letters = new char[26];
        int index = 0;

        for (int i = 0; i < 26; i++) {
            letters[i] = (char)(97 + (index++));
        }

        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < letters.length; j++) {
                if (string.charAt(i) == letters[j]){
                    System.out.printf("%c -> %d%n", string.charAt(i), j);
                }
            }
        }
    }
}
