package lesson_04;

public class logicaAnd {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;
        System.out.println((a&&b));
        System.out.println((a&&c));
        System.out.println((c&&b));
        System.out.println((c&&d));
        System.out.println((5>0)&& (6==6));
        System.out.println((5<0)&& (6==6));
        System.out.println((5>0)&& (6==6)&&(6!=6));
    }
}
