public class Book {

    private String title;
    private String author;
    private long isbn;
    private boolean borrowed;
    private User borrowedBy;

    public Book(String title, String author, long isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.borrowed = false;
    }

    public boolean borrow(User u){
        if(!this.borrowed){
            this.borrowed = true;
            this.borrowedBy = u;
            u.borrowBook(this);
            return true;
        }
        return false;
    }

    public User getBorrowedBy() {
        return borrowedBy;
    }

    public boolean handBack(){
        if(this.borrowed){
            this.borrowed = false;
            this.borrowedBy.handBack(this);
            this.borrowedBy = null;
            return true;
        }
        return false;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public long getIsbn() {
        return isbn;
    }

    public boolean getBorrowed() {
        return borrowed;
    }

    public String toString(){
        return this.title + " by " + this.author;
    }
}
