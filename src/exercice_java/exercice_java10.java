package exercice_java;

import java.util.Scanner;

public class exercice_java10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num , sum = 0;
        double avg;
        System.out.println("Please enter number with 3 digits");
        num = scanner.nextInt();

        if (num >= 100 && num <= 999){// בעצם המספרים היחידים שכוללות 3 ספרות
            sum =+ num % 10;//
            num /= 10;//
            sum += num % 10;//
            num /= 10;//
            sum += num % 10;//

            avg = (double) sum / 3;//
            System.out.println(avg);

        }



    }
}
