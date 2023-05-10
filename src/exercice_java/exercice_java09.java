package exercice_java;

import java.util.Scanner;

public class exercice_java09 {
    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        num = scanner.nextInt();

        if (num % 10 == 5){// משתמשים במודולו כדי לבדוק את הסיפרה אחרונה מהמספר ולבדוקק האם היא שווה ל5
            System.out.println("EQAL");
        }
        else if (num % 10 > 5) {//משתמשים במודולו כדי לבדוק את הסיפרה אחרונה מהמספר ולבדוקק האם היא גדולה ל5
            System.out.println("Bigger than 5");
        }
        else {//אחרת זה כנראה קאן מ5
            System.out.println("Smaler than 5");
        }
    }
}
