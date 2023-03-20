package lesson_05.loops;

public class ForLoopTask {
    public static void main(String[] args) {

        int summary = 0;

        for (int i = 1000; i >= 0; i--) {
            if(i % 5 == 0) {
                System.out.println(i);
                summary+=i;
            }

        }

        System.out.println("summary = " + summary);
    }
}