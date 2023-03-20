package lesson_05.Array.classTask;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListClassTask {
    public static void main(String[] args) {
        double summary = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number 1: ");
        int firstNumber = scanner.nextInt();
        summary += firstNumber;
        System.out.println("Please enter number 2: ");
        int secondNumber = scanner.nextInt();
        summary += secondNumber;
        System.out.println("Please enter number 3: ");
        int thirdNumber = scanner.nextInt();
        summary += thirdNumber;

        int numbersArray[] = {firstNumber, secondNumber, thirdNumber};
        System.out.println(numbersArray);

        int biggestNumber = (numbersArray[0] > numbersArray[1]) ? numbersArray[0] : numbersArray[1];
        int smallest = (numbersArray[0] < numbersArray[1]) ? numbersArray[0] : numbersArray[1];
        biggestNumber = (numbersArray[2] > biggestNumber) ? numbersArray[2] : biggestNumber;
        smallest = (numbersArray[2] < smallest) ? numbersArray[2] : smallest;

        System.out.println("biggestNumber = " + biggestNumber);
        System.out.println("smallest = " + smallest);
        System.out.println("(summary / 3.0) = " + (summary / 3.0));
        System.out.println(numbersArray);
    }
}
