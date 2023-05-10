package exercice_java;

public class exercice_java03 {
    public static void main(String[] args) {
        String str = "123456783";
        int num = Integer.valueOf(str);//הופך את המחרוזת למספר שלם
        int lastDiggit = num % 10 ; // מחזיר רק את סיפרה אחרונה
        lastDiggit = lastDiggit * 3;//מכפיל פי 3
        // הסיפרה אחרונה עדיין נמצא במקום אחרון ולכן צריך להוריד אותו כדי להחליף אותו
        num = num/10;// מוריד את המספר
        num = num * 10 ;//להחזיר את המספר
        num = num + lastDiggit;//להוסיף את התוצאה שהכפלנו
        str = String.valueOf(num);//המרה בחזרה למחרוזת
        System.out.println(str);






    }
}
