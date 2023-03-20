package lesson_05.Array.classTask;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClassWork {
    public static void main(String[] args) {


        int array[] = new int[5];
        array[0] = 5;
        System.out.println("array.length = " + array.length);

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("arrayList.size() = " + arrayList.size());
        arrayList.add(6); // 0
        System.out.println("arrayList = " + arrayList);
        System.out.println("arrayList.get(0) = " + arrayList.get(0));
        arrayList.add(120); // 1
        System.out.println("arrayList = " + arrayList);
        System.out.println("arrayList.get(1) = " + arrayList.get(1));
        System.out.println("arrayList.size() = " + arrayList.size());
        arrayList.add(0, 10);
        System.out.println("arrayList = " + arrayList);
        arrayList.set(1, 50);
        System.out.println("arrayList = " + arrayList);
        System.out.println("arrayList.get(1) = " + arrayList.get(1));
        System.out.println("arrayList.size() = " + arrayList.size());
        System.out.println("arrayList.get(0) = " + arrayList.get(0));
        arrayList.add(400);
        // arrayList.add(15, 10);  // triggers error outOfBounds

        System.out.println("arrayList = " + arrayList);


        //  indexes   0     1    2      3
        //            10    50   120    400
    }
}