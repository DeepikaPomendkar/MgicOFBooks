public class Book {

    private String bookName;
    private String authorName;
    private String description;
    private String bookId;


    public String getBookId() {
        return bookId;
    }

    public Book(String bookName, String authorName, String description, String bookId) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.description = description;
        this.bookId = bookId;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", description='" + description + '\'' +
                ", bookId='" + bookId + '\'' +
                '}';
    }
}
