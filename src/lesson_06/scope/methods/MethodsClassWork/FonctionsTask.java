package lesson_06.scope.methods.MethodsClassWork;

import java.util.ArrayList;

public class FonctionsTask {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 1000));
        }

        printArrayList(numbers);
        System.out.println("\ngetMaxNumberOfArrayList(numbers) = " + getMaxNumberOfArrayList(numbers));

    }

    public static void printArrayList(ArrayList<Integer> arrayList) {

        arrayList.forEach((number) -> System.out.print(number + " "));
    }

    public static int getMaxNumberOfArrayList(ArrayList<Integer> arrayList) {

        int maxNumber = arrayList.get(0); // 5
        // maxNumber = 5  index 1 = 7

        for (int i = 1; i < arrayList.size(); i++){
            if (maxNumber > arrayList.get(i)) {
                maxNumber = maxNumber;
            }
            else {
                maxNumber = arrayList.get(i);
            }
        }
        System.out.println("maxNumber = " + maxNumber);
        return  maxNumber;
    }



}

