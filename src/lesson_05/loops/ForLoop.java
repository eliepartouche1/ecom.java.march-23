package lesson_05.loops;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
        //  indexes          0        1        2        3       4
        String names[] = {"Alex", "Nitzan", "Michal", "Dan", "Bibi"};


        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ". " + names[i]);
        }




    }
}