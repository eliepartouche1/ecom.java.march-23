package lesson_04.homeTask;

import java.util.Scanner;

public class CredentialsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your username");
        String username = "elie partouche";
        String password = "12345678";

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if (a.equals("elie partouche") && b.equals("12345678")) {
            System.out.println("welcome");
        }
        else {
            System.out.println("something is wrong");

        }
    }
}
