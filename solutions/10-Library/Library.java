import java.util.*;

public class Library {

    private Map<Long, List<Book>> libraryBooks;
    private Set<User> libraryUsers;

    public Library(){
        this.libraryBooks = new HashMap<>();
        this.libraryUsers = new HashSet<>();
    }

    public boolean addUser(User u){
        return this.libraryUsers.add(u);
    }

    public void addBook(Book b){
        if(!this.libraryBooks.containsKey(b.getIsbn())){
            this.libraryBooks.put(b.getIsbn(), new ArrayList<>());
        }
        this.libraryBooks.get(b.getIsbn()).add(b);
    }

    public static void main(String[] args){
        Library l = new Library();
        Book b0 = new Book("HP 1", "JKR",123456789);
        Book b1 = new Book("HP 2", "JKR",234567891);
        Book b2 = new Book("HP 3", "JKR",345678912);
        Book b3 = new Book("HP 3", "JKR",345678912);
        List<Book> l0 = new ArrayList<>();
        List<Book> l1 = new ArrayList<>();
        List<Book> l2 = new ArrayList<>();
        l0.add(b0);
        l1.add(b1);
        l2.add(b2);
        l2.add(b3);
        l.libraryBooks.put(b0.getIsbn(), l0);
        l.libraryBooks.put(b1.getIsbn(), l1);
        l.libraryBooks.put(b2.getIsbn(), l2);
        User u0  = new User(1, "Peter");
        b0.borrow(u0);
        b2.borrow(u0);
        System.out.println(b0.getBorrowedBy().getId());
        b0.handBack();
        for(Book b : u0.getBorrowedBooks()){
            for(Book e : l.libraryBooks.get(b.getIsbn())){
                if(!e.getBorrowed()){
                    System.out.println(e + " available");
                }
            }
        }
    }
}
