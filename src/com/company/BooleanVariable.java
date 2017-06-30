package com.company;

import java.util.Scanner;

public class BooleanVariable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bool = scan.nextLine();

        boolean bool2 = Boolean.parseBoolean(bool);

        if (bool2){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
