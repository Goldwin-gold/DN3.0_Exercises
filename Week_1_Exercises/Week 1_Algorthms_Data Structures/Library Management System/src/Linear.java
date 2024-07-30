public class Linear {
    public static Book linear(Book[] books, String bookName){
        for(Book Book: books){
            if(Book.getTitle().equalsIgnoreCase(bookName)){
                return Book;
            }
        }
        return null;
    }
}
