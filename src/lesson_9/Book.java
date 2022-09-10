package lesson_9;

import java.util.Objects;

public class Book {
    private final String bookName;
    private int publisherYear;
    private final Author authorName;

    public Book(String bookName, int publisherYear, Author authorName) {
        this.bookName = bookName;
        this.publisherYear = publisherYear;
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "название книги : " + bookName + " " + " ,год издания " + publisherYear +
                " ,автор " + authorName;
    }

    @Override
    public boolean equals(Object Book) {
        if (this.getClass() != this.getClass()) {
            return false;

        }
        Book Book2 = (Book) Book;
        return getBookName().equals(Book2.getBookName());

    }
    public int hashCode() {
        return Objects.hash(getBookName());
    }

}


//    Реализовать методы toString, equals и hashCode в классах Author и Book,
//        которые были созданы на прошлом уроке. Обратите внимание,
//        что toString книги не должен дублировать код из toString автора,
//        а должен делегировать (вызывать) его версию метода.