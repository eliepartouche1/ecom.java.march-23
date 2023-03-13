package classTasks;
import java.util.Scanner;
public class clockclass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is a time now?");
        int clock = input.nextInt();
        System.out.println("a time is ");
        System.out.println(clock / 100 + ":" +(clock % 100) );

    }
}
