package lesson_04.Conditions;

import java.util.Scanner;

public class Rangers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
        if (number > 0 && number <= 20) {
            System.out.println("number "+ number +"range of 0 - 20");
        }
        else if (number>20 && number <= 30) {
            System.out.println("number "+ number +"range of 21 - 30");
        }
        else {
            System.out.println("number "+ number +"is not validi");
        }


    }

}
