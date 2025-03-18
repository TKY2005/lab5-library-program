/*
 * name: Youssef Mohamed Torki Ahmed
 * ID: 445820246
 * lab5 code
 */


public class Book{
    private long bookId;
    private String title;
    private String author;
    public boolean isAvailable;

    public Book(String title, String author, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    
    public void setTitle(String title) {this.title = title;}
    public void setId(long id) {this.bookId = id;}
    public void setAuthor(String author) {this.author = author;}

    public String getTitle() {return title;}
    public long getId() {return bookId;}
    public String author() {return author;}
    
    public String toString(){
        String info = String.format("""
            ============================================
                Title: %s
                ID: %d
                Author name: %s
                is this book available: %s
            ============================================
                """, title, bookId, author, isAvailable);
        
        return info;
    }
}