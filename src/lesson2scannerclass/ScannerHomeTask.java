package lesson2scannerclass;
import java.util.Scanner;
public class ScannerHomeTask
    {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("what is your firstname?");
            String myFirstname = input.nextLine();
            System.out.println("what is your lastname?");
            String myLastname = input.nextLine();
            System.out.println("where are you live?");
            String mylocation = input.nextLine();
            System.out.println("what is your average");
            int myAverage = input.nextInt();
            System.out.println("what is your age");
            int myAge = input.nextInt();
        }
}
