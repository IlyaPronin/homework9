package lesson_9;

public class Book {
    private final String bookName;
    private int publisherYear;
   private final Author authorName;

    public Book(String bookName,int publisherYear,Author authorName){
        this.bookName =  bookName;
        this.publisherYear = publisherYear;
        this.authorName = authorName;
    }
    public String getBookName(){
        return bookName;
    }
    public Author getAuthorName(){
        return authorName;
    }
    public int getPublisherYear(){
        return publisherYear;
    }
    public void  setPublisherYear(int publisherYear){
        this.publisherYear = publisherYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "название книги '" + bookName + " "+ " ,год издания "+publisherYear +
                " ,автор" + authorName ;
    }
}
