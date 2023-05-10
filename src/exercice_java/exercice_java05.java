package exercice_java;

public class exercice_java05 {
    public static void main(String[] args) {
        String fullName = "Elie Partouche";
        String LastName = fullName.substring(5,fullName.length());//צריך להתחיל מהאות לפני תחילת השם משפחה עד כמות אותיות שיש במחרוזת
        System.out.println(LastName);
    }
}
