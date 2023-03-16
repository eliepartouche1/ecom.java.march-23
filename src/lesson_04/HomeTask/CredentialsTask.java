package lesson_04.HomeTask;

import java.util.Scanner;

public class CredentialsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what a month?");
        int month = scanner.nextInt();

        if (month==1){
            System.out.println("January");
        }
        else if (month==2||month>1&&month<3) {
            System.out.println("February");
        }

        else if (month==3||month>2&&month<4) {
            System.out.println("March");
        }

        else if (month==4||month>3&&month<5) {
            System.out.println("April");
        }

        else if (month==5||month>4&&month<6) {
            System.out.println("May");
        }

        else if (month==6||month>5&&month<7) {
            System.out.println("June");
        }

        else if (month==7||month>6&&month<8) {
            System.out.println("July");
        }

        else if (month==8||month>7&&month<9) {
            System.out.println("August");
        }

        else if (month==9||month>8&&month<10) {
            System.out.println("Septembre");
        }

        else if (month==10||month>9&&month<11) {
            System.out.println("October");
        }

        else if (month==11||month>10&&month<12) {
            System.out.println("November");
        }

        else if (month==12) {
            System.out.println("December");
        }
        else {
            System.out.println("is not exicte");
        }
    }
}
