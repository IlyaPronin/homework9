package lesson_9;

import java.sql.SQLOutput;

public class HomeWork9 {
    public static void main(String[] args) {
        var Author = new Author("Эрнест", "Хамингуэй");
        var Author2 = new Author("Харуки ", "Мураками");
        var Book  = new Book("Фиеста", 1926, Author );
        var Book2 = new Book("Страна чудес без тормозов и конец света", 2020, Author2);

        System.out.println(Book2);
        System.out.println(Book);

        Book2.setPublisherYear(1999);

        System.out.println(Book2);
    }
    }
