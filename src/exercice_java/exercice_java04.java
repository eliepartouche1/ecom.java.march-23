package exercice_java;

public class exercice_java04 {
    public static void main(String[] args) {
        int a = 12;
        int b = 24;
        int c = 37;

        int sum;
            //   2      4      7
        sum = (a%10)+(b%10)+(c%10); // הסכמנו את כל השאריות ביחד שיצא סכום אחד
        System.out.println(sum);
    }
}
