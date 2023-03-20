package lesson_05.Array.classTask;

public class ArrayClassWork {
    public static void main(String[] args) {
        int numbersArray[] = new int[10];
        System.out.println("numbersArray[0] = " + numbersArray[0]);
        numbersArray[0] = 15;
        System.out.println("numbersArray[0] = " + numbersArray[0]);
        System.out.println("numbersArray[1] = " + numbersArray[0]);
        numbersArray[1] = 20;
        System.out.println("numbersArray[1] = " + numbersArray[1]);
        System.out.println("numbersArray.length = " + numbersArray.length);

        //           indexes     0   1   2   3   4
        int numbersOfArray2[] = {5, 10, 15, 20, 100};
        System.out.println(numbersOfArray2[0]);
        System.out.println("numbersOfArray2.length = " + numbersOfArray2.length);
    }
}