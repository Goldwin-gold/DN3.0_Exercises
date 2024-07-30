import java.util.Arrays;
import java.util.Comparator;

public class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book[] books={
                new Book(1,"A good girl's guide to murder","holly jackson"),
                new Book(1,"origins","Dan brown"),
                new Book(3,"50 shades of grey","E L james"),
                new Book(4,"Million kisses in your life time","Goldwin")
        };

        Arrays.sort(books,Comparator.comparing(Book::getTitle));
        Book found1=Linear.linear(books,"origins");
        System.out.println("the book found is"+found1);
        Book found2=binary.binary(books,"origins");
        System.out.println("the found book"+found2);
    }
}
