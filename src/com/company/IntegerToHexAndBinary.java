package com.company;

import java.util.Scanner;

public class IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        String resultHex = Integer.toHexString(number);
        String resultBinary = Integer.toBinaryString(number);

        System.out.println(resultHex.toUpperCase());
        System.out.println(resultBinary);
    }
}
