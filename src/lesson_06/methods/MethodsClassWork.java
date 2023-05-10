package lesson_06.methods;

import java.util.Date;

public class MethodsClassWork {
    public static void main(String[] args) {

        sayHello();
        sayHelloWithName("Alexander");

        String myName = "Sasha";
        sayHelloWithName(myName);

        int summary = sum(10, 5);
        System.out.println("summary = " + summary);

        System.out.println("getRandomNumber() = " + getRandomNumber());

        long randomNumber = getRandomNumber();

        if (randomNumber > 122342342423423432L) {
            System.out.println("Random number greater than 122342342423423432");
        }

    }

    public static void sayHello() {
        System.out.println("Good Evening Alex!");
    }

    public static void sayHelloWithName(String name) {
        System.out.println("Good Evening " + name + "!");
    }

    public static long getRandomNumber() {
        Date date = new Date();
        long randomNumber = date.getTime();
        System.out.println("Printing from the method getRandomNumber()");
        return randomNumber;
    }

    public static int sum(int a, int b) {
        return a + b;
    }


}