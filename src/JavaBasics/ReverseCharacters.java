package JavaBasics;

import java.util.Scanner;

public class ReverseCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char firstChar = scan.next().charAt(0);
        char secondChar = scan.next().charAt(0);
        char thirdChar = scan.next().charAt(0);

        System.out.printf("%s%s%s", thirdChar, secondChar, firstChar);
    }
}
