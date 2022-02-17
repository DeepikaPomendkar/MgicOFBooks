
import java.util.*;
public class MagicOfBooks {
    public static CreateData data = new CreateData();
    public static ArrayList<User> users;
    public static ArrayList<Book> books;

    public User userLogin(String userId, String password) {
        for( User user: users){
            if (userId.equals(user.getUserId()) && password.equals(user.getPassword())){
                return user;
            }
        }
        return null;
    }
    public void checkFavBooks(User user){
        System.out.println(user.getFavourite());
    }
    public void checkCompletedBooks(User user){
        System.out.println(user.getCompleted());
    }
    public void checkNewBooks(User user){
        System.out.println(user.getNewBooks());
    }
    public void checkBookDetails(String bookId){
        for( Book book: books){
            if (bookId.equals(book.getBookId())){
                System.out.println(book);
                break;
            }
        }
    }

     public static void main(String args[]){
         MagicOfBooks mg = new MagicOfBooks();
         Scanner sc= new Scanner(System.in);
         users = data.createUser();
         books = data.createBooks();
        while(true) {
            System.out.println("Welcome User");
            System.out.println("Please provide userName");
            String userName = sc.nextLine();
            System.out.println("Please provide password");
            String password = sc.nextLine();
            User user = mg.userLogin(userName, password);
            if(user !=null) {
                System.out.println("Logged In Successfully");
                while (true) {

                    System.out.println("1: To check Favourite Books");
                    System.out.println("2: To check New Books");
                    System.out.println("3: To check Completed Books");
                    System.out.println("4: To get Book Details");
                    System.out.println("5: Enter 5 to log out");
                    int i = sc.nextInt();

                    if (i == 1) {
                        mg.checkFavBooks(user);
                    } else if (i == 2) {
                        mg.checkNewBooks(user);
                    } else if (i == 3) {
                        mg.checkCompletedBooks(user);
                    } else if (i == 4) {
                        System.out.println("Please enter Book Id");
                        sc.nextLine();
                        String bookId = sc.nextLine();
                        mg.checkBookDetails(bookId);
                    } else if(i ==  5){
                        break;
                    }
                    else {
                        System.out.println("You have selected wrong option");
                    }

                }
            }
            else{
                System.out.println("Wrong User name or Password. Please Try Again");
            }

        }



     }
}
