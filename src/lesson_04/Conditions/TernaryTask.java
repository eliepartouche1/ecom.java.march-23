package lesson_04.Conditions;

import java.util.Scanner;

public class TernaryTask {
    public static void main(String[] args) {

        double sammery = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number 1");

        int firstnumber = scanner.nextInt();
        sammery += firstnumber;
        System.out.println("enter number 2");

        int secondnumber = scanner.nextInt();
        sammery += secondnumber;
        System.out.println("enter number 3");

        int thirdnumber = scanner.nextInt();
        sammery += thirdnumber;

        int biggestnumber=(firstnumber>secondnumber)?firstnumber:secondnumber;

        biggestnumber= (thirdnumber>biggestnumber)?
                thirdnumber:biggestnumber;
        System.out.println(biggestnumber);
        System.out.println(sammery/3/0);







    }
}
