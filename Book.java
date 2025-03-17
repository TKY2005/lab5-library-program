/*
 * name: Youssef Mohamed Torki Ahmed
 * ID: 445820246
 * lab5 code
 */


public class Book{
    private int bookId;
    private String title;
    private String author;
    public boolean isAvailable;

    public Book(String title, int id, String author, boolean isAvailable){
        this.title = title;
        this.bookId = id;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    
    public void setTitle(String title) {this.title = title;}
    public void setId(int id) {this.bookId = id;}
    public void setAuthor(String author) {this.author = author;}

    public String getTitle() {return title;}
    public int getId() {return bookId;}
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