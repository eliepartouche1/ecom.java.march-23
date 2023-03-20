package lesson_05.Array.Array;

import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number[] = {1,2,3};
        System.out.println("enter a max number");

        int maxNumber = scanner.nextInt();
        System.out.println(number[2]);

        int avgNumber = scanner.nextInt();
        System.out.println(avgNumber[1]);


    }
}
