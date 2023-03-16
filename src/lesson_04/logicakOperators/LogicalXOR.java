package lesson_04.logicakOperators;

public class LogicalXOR {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;
        System.out.println((a^b));
        System.out.println((a^c));
        System.out.println((c^b));
        System.out.println((c^d));
    }
}
