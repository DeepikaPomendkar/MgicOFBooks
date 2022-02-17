import java.util.ArrayList;

public class User {
    /* This class represents the various attributes associated with a user and
    the respective getters and setters to access the private variables

     */

        private String userName;
        private String userId;
        private String emailId;
        private String password;
        private ArrayList<Book> newBooks;
        private ArrayList<Book> favourite;
        private ArrayList<Book> completed;


    public User(String userName, String userId, String emailId, String password) {
        this.userName = userName;
        this.userId = userId;
        this.emailId = emailId;
        this.password = password;
    }

    public ArrayList<Book> getNewBooks() {
        return newBooks;
    }

    public void setNewBooks(ArrayList<Book> newBooks) {
        this.newBooks = newBooks;
    }

    public ArrayList<Book> getFavourite() {
        return favourite;
    }

    public void setFavourite(ArrayList<Book> favourite) {
        this.favourite = favourite;
    }

    public ArrayList<Book> getCompleted() {
        return completed;
    }

    public void setCompleted(ArrayList<Book> completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", newBooks=" + newBooks +
                ", favourite=" + favourite +
                ", completed=" + completed +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }
}
