package com.company;

import java.util.Scanner;

public class VariableInHexadecimalFormat {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        Integer result = Integer.parseInt(string, 16);

        System.out.print(result);

    }
}
