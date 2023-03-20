package lesson_05.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOfString {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Alex");
        list.add("Michal");
        list.add("Nitzan");
        list.add("Dan");
        list.add("Ladislav");

        System.out.println("list.size() = " + list.size());
        System.out.println("list.indexOf(\"Nitzan\") = " + list.indexOf("Nitzan"));
        System.out.println("list.indexOf(\"BLABLA\") = " + list.indexOf("BLABLA"));
        System.out.println("list.contains(\"Michal\") = " + list.contains("Michal"));
        System.out.println("list.contains(\"Michal234234\") = " + list.contains("Michal24234234324"));

        System.out.println("list = " + list);
        list.remove(0);
        System.out.println("list = " + list);
        list.remove("Nitzan");
        System.out.println("list = " + list);
        list.remove("45646546");
        System.out.println("list = " + list);

    }
}