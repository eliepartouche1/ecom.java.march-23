package exercice_java;

import java.util.Scanner;

public class exercice_java07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Age;
        System.out.println("Please enter your age");
        Age = scanner.nextInt();//קליטה מהמשתמש
        if (Age > 18){// תנאי שדורש סוגריים ואז סוגרים מסולסלות וקפית שורה
            System.out.println("yes");
        }
        else{//תנאי שדורש סוגריים ואז סוגרים מסולסלות וקפית שורה
            System.out.println("no");
        }

   }
}
