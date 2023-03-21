package lesson_05.homeTask;

import java.util.Scanner;

public class CreditCardTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your number card and password");
        int card = 12345678;
        String password = "87654321";

        int cards = scanner.nextInt();
        String passwords = scanner.nextLine();

        if ((cards == card) && (passwords.equals(password))){
            System.out.println("welcome elie");
        }
        else{
            System.out.println("try again");
        }



    }
}
