
import java.util.*;
public class CreateData {


    public ArrayList<Book> createBooks(){
        ArrayList<Book> books = new ArrayList<Book>();
        Book book1 = new Book("Harry Potter 1", "JKRowling", "Harry Potter is a series of seven fantasy novels written by British author J. K. Rowling.","1");
        Book book2 = new Book("Harry Potter 2", "JKRowling", "Harry Potter is a series of seven fantasy novels written by British author J. K. Rowling.","2");
        Book book3 = new Book("Harry Potter 3", "JKRowling", "Harry Potter is a series of seven fantasy novels written by British author J. K. Rowling.","3");
        Book book4 = new Book("Harry Potter 4", "JKRowling", "Harry Potter is a series of seven fantasy novels written by British author J. K. Rowling.","4");
        Book book5 = new Book("Harry Potter 5", "JKRowling", "Harry Potter is a series of seven fantasy novels written by British author J. K. Rowling.","5");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        return books;
    }

    public ArrayList<User> createUser(){
        ArrayList<User> users = new ArrayList<User>();
        ArrayList<Book> books = createBooks();

        // Create Dummy User 1
        User user1 = new User("A","A1","A@gmail.com","A@123");
        ArrayList<Book> completedUser1=new ArrayList<Book>();
        completedUser1.add(books.get(0));
        ArrayList<Book> favUser1=new ArrayList<Book>();
        favUser1.add(books.get(0));
        ArrayList<Book> newBookUser1=new ArrayList<Book>();
        newBookUser1.add(books.get(1));
        user1.setCompleted(completedUser1);
        user1.setFavourite(favUser1);
        user1.setNewBooks(newBookUser1);

        // Create Dummy User 2
        User user2 = new User("B","B1","B@gmail.com","B@123");
        ArrayList<Book> completedUser2=new ArrayList<Book>();
        completedUser2.add(books.get(2));
        ArrayList<Book> favUser2=new ArrayList<Book>();
        favUser2.add(books.get(2));
        ArrayList<Book> newBookUser2=new ArrayList<Book>();
        newBookUser2.add(books.get(3));
        newBookUser2.add(books.get(0));
        user2.setCompleted(completedUser2);
        user2.setFavourite(favUser2);
        user2.setNewBooks(newBookUser2);

        users.add(user1);
        users.add(user2);

        return  users;
    }


}
