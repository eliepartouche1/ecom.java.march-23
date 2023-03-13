package lesson_2;

import java.util.Scanner;

public class scannerlesson2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in
        );

        System.out.println("what is your name? ");
        String myName = input.nextLine();
        System.out.println("myName = " + myName);

        System.out.println("what is your age?  ");
        int myAge = input.nextInt();

        System.out.println("what is my avrang?  ");
        double myAvrange = input.nextDouble();
        System.out.println();


    }
}
