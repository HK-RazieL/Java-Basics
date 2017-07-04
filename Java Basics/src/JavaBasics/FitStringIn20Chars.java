package JavaBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FitStringIn20Chars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        if (text.length() <= 20) {
            System.out.println(addStars(text));
        } else {
            System.out.println(text.substring(0, 20));
        }
    }

    private static String addStars (String text) {
        int difference = 20 - text.length();
        StringBuilder sb = new StringBuilder(text);

        for (int i = 0; i < difference; i++) {
            sb.append("*");
        }

        return sb.toString();
    }
}
