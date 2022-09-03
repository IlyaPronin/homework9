import lesson_9.Author;
import lesson_9.Book;

public class Main {
    public static void main(String[] args) {
        var Author = new Author("эрнест", "Хамингуэй");
        var Book  = new Book("Фиеста", 1998,Author );
        System.out.println(Book);
    }
}