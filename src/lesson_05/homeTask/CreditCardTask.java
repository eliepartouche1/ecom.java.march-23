package lesson_05.homeTask;

import java.util.Scanner;

public class CreditCardTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cardNumber = 12345678;
        var password = "ALexander";
        int actualCardNumber;
        String actualPassword;

        for (int i = 5; i >= 0; i--) {

            if (i == 0) {
                System.out.println("No more attempts! The card was blocked!");
                break;
            }

            System.out.println("What is your card number? ");
            actualCardNumber = scanner.nextInt();
            /*
             * The problem is with the input.nextInt() method;
             * it only reads the int value. So when you continue reading with input.nextLine()
             * you receive the "\n" Enter key. So to skip this you have to add the input.nextLine().*/
            scanner.nextLine();

            System.out.println("What is your password?");
            actualPassword = scanner.nextLine();

            if (cardNumber == actualCardNumber && password.equalsIgnoreCase(actualPassword)) {
                System.out.println("Welcome to the system!");
                break;
            }

            if (i > 1) {
                System.out.println("Incorrect details. Please try again. You have another " + (i-1) + " attempts.");
            }
        }
    }
}