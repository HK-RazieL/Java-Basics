package com.company;

import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char firstChar = scan.next().charAt(0);

        if(firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'y' || firstChar == 'u'){
            System.out.print("vowel");
        } else if (Character.isDigit(firstChar)) {
            System.out.print("digit");
        } else {
            System.out.print("other");
        }
    }
}
