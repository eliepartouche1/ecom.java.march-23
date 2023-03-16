package lesson_04.Conditions;

import java.util.Scanner;

public class IfelseTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pleze enter youre number");
        int a = scanner.nextInt();

        if (a%2==0){
            System.out.println("is ");
        }
        else {
            System.out.println("is not");
        }
    }
}
