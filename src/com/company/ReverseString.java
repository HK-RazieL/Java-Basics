package com.company;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        StringBuilder reverse = new StringBuilder();
        System.out.println(reverse.append(string).reverse());
    }
}
