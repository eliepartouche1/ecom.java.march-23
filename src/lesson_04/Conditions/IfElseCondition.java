package lesson_04.Conditions;

import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("what is youre age?");

        int age = 18;

        if (age >= 18){
            System.out.println("your are adult");
        }
        else if (age==18) {
            System.out.println("your are 18 old years");
        }
        else; {
            System.out.println("your are a child");
        }
    }
}
