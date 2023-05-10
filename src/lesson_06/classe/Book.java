package lesson_06.classe;

public class Book {

    String name;
    int year;

    String author;

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Book(String name, int year, String author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public Book() {
    }
}