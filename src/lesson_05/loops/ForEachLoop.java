package lesson_05.loops;
import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Alex");
        list.add("Michal");
        list.add("Nitzan");
        list.add("Dan");
        list.add("Ladislav");

        System.out.println("========== option1 - for loop ============");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("========== option2 - while loop ============");

        int i = 0;
        while (i < list.size()) {
            System.out.print(list.get(i) + " ");
            i++;
        }
        System.out.println();
        System.out.println("========== option3 - For-Each loop ============");


        for (String name : list) {
            System.out.print(name + " ");
        }
        System.out.println();

        System.out.println("========== option4 - forEach loop ============");

        list.forEach((name) -> System.out.print(name + " "));

    }
}