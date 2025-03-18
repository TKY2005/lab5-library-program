/*
 * name: Youssef Mohamed Torki Ahmed
 * ID: 445820246
 * lab5 code
 */

public class Book{
    private long bookId;
    private String title;
    private String author;
    private String genere;
    public boolean isAvailable;

    public Book(String title, String author, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    
    public void setTitle(String title) {this.title = title;}
    public void setId(long id) {this.bookId = id;}
    public void setAuthor(String author) {this.author = author;}
    public void setGenere(String genere) {this.genere = genere;}

    public String getTitle() {return title;}
    public long getId() {return bookId;}
    public String author() {return author;}
    public String getGenere() {return genere;}
    
    public String toString(){
        String info = String.format("""
            ============================================
                Title: %s
                Genre: %s
                ID: %d
                Author name: %s
                is this book available: %s
            ============================================
                """, title, genere, bookId, author, isAvailable);
        
        return info;
    }
}