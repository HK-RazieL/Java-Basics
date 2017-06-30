package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numberSequence = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        List<Integer> currentSequence = new ArrayList<>();
        List<Integer> longestSequence = new ArrayList<>();

        for (int i = 0; i < numberSequence.length - 1; i++) {
            if (numberSequence[i] == numberSequence[i+1] && i == numberSequence.length - 2) {
                currentSequence.add(numberSequence[i]);
            }

            if (numberSequence[i] == numberSequence[i+1]) {
                currentSequence.add(numberSequence[i]);

            } else if (numberSequence[i] != numberSequence[i+1]) {
                currentSequence.add(numberSequence[i]);

                if (currentSequence.size() > longestSequence.size()){
                    longestSequence.clear();
                    longestSequence.addAll(currentSequence);
                }

                currentSequence.clear();
            }

            if (currentSequence.size() > longestSequence.size()){
                longestSequence.clear();
                longestSequence.addAll(currentSequence);
            }
        }

        StringJoiner joiner = new StringJoiner(" ");
        for (Integer i : longestSequence) {
            joiner.add(i.toString());
        }
        System.out.println(joiner.toString());
    }
}
