package lesson_04.HomeTask;

import java.util.Scanner;

public class CredentialsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your username");
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        if (username.equals("elie partouche") && password.equals("12345678")) {
            System.out.println("welcome");
        }
        else {
            System.out.println("something is wrong");

        }
    }
}
