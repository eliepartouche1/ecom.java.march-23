package lesson_05.homeTask;

import java.util.ArrayList;
import java.util.List;

public class ContrieClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("France");
        list.add("Israel");
        list.add("Canada");
        list.add("Italy");
        list.add("Spain");
        list.add("Russe");
        list.add("Afrique");
        list.add("Asia");
        list.add("Mexico");
        list.add("Argentine");
        for (String name : list){
            System.out.println(name + "");
        }
        System.out.println();
        list.forEach((name) -> System.out.println(name + ""));
    }
}
