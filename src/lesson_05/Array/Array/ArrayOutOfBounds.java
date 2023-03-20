package lesson_05.Array.Array;

public class ArrayOutOfBounds {
    public static void main(String[] args) {
//                          0        1        2
        String names[] = {"Alex", "Nitzan", "Moshe34"};
        System.out.println("names.length = " + names.length);
        System.out.println("names[1] = " + names[1]);
        System.out.println("names[0] = " + names[0]);
        System.out.println("names[2] = " + names[2]);
        names[2] = "Alexey";
        System.out.println("names[2] = " + names[2]);
//        names[3] = "Moshe";   // -> triggers exception of outOfBounds
//        System.out.println("names[3] = " + names[3]);

    }
}