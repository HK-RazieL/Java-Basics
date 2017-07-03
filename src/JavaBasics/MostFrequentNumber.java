package JavaBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MostFrequentNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numberSequence = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Map<Integer,Integer> number = new LinkedHashMap<>();

        for (int i = 0; i < numberSequence.length; i++) {
            int counter = 0;

            for (int j = 0; j < numberSequence.length; j++) {
                if (numberSequence[i] == numberSequence[j]) {
                    counter++;
                }
            }

            if (!number.containsKey(numberSequence[i])) {
                number.put(numberSequence[i], counter);
            }
        }

        Map.Entry<Integer,Integer> max = null;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : number.entrySet()) {
            if (max == null || integerIntegerEntry.getValue().compareTo(max.getValue()) > 0) {
                max = integerIntegerEntry;
            }
        }

        System.out.println(max.getKey());
    }
}
