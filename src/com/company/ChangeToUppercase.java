package com.company;

import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeToUppercase {
    public static void main(String[] args) {
        java.io.BufferedReader reader = new java.io.BufferedReader(new InputStreamReader(System.in));
        String text = null;
        try {
            text = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String start = "<upcase>";
        String end = "</upcase>";

        int startIndex = text.indexOf(start);
        int endIndex = text.indexOf(end);

        while (startIndex >= 0 && endIndex >= 0) {
            String replacement = text.substring(startIndex + start.length(), endIndex).toUpperCase();
            String oldPartOfText = text.substring(startIndex, endIndex + end.length());
            text = text.replace(oldPartOfText, replacement);
            startIndex = text.indexOf(start, startIndex + 1);
            endIndex = text.indexOf(end, endIndex + 1);
        }

        System.out.println(text);
    }
}
