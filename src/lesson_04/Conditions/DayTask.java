package lesson_04.Conditions;

import java.util.Scanner;

public class DayTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pleaze enter number");
        int day = scanner.nextInt();
        switch (day){
        case 1:
        System.out.println("Sunday");
        break;
        case 2:
        System.out.println("Monday");
        break;
        case 3:
        System.out.println("Tusday");
        break;
        case 4: System.out.println("Wendesday");
        break;
        case 5:
        System.out.println("Thurday");
        break;
        case 6:
        System.out.println("Friday");
        break;
        case 7:
        System.out.println("Shabbat");
        break;
            default:
                System.out.println("day is not existe");
                break;
        }






    }
}
