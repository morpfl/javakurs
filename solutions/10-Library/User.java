import java.util.HashSet;

public class User {

    private int id;
    private String name;
    private HashSet<Book> borrowedBooks;
    private int debt;

    public int getDebt(){
        return this.debt;
    }

    public User(int id, String name){
        this.id = id;
        this.name = name;
        this.borrowedBooks = new HashSet<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashSet<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public boolean borrowBook(Book b){
        if(this.borrowedBooks.contains(b)){
            return false;
        }
        if(this.borrowedBooks.size()>=10){
            this.debt++;
        }
        this.borrowedBooks.add(b);
        return true;
    }

    public boolean handBack(Book b){
        return this.borrowedBooks.remove(b);
    }
}
