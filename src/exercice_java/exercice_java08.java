package exercice_java;

import java.util.Scanner;

public class exercice_java08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your grade");
        int Grade = scanner.nextInt();//

        if (Grade >= 90 && Grade <= 100){//בדיקת טווח בין 90 ל100 כולל
            System.out.println("A");
        }
        else if (Grade >= 70 && Grade <= 89){// בדיקת בין 70 ל89 כולל
            System.out.println("B");
        }
        else if (Grade >= 55 && Grade <= 69){// בדיקה טווח בין 55 ל69 כולל
            System.out.println("C");
        }
        else {//לכל מקרה אחר של נכשל
            System.out.println("F");
        }
    }
}
