/*
 * name: Youssef Mohamed Torki Ahmed
 * ID: 445820246
 * lab5 code
 */


 // TODO: figure out where to add the genere field, ask about the generic used in the List and why it exists in the first place
 // when you have a map that does the same job even better than the list.
 // add a user interface.
import java.util.*;

public class Library {
    String[] generes = {"Undefined", "History", "Fiction", "Philosophy", "Science", "Novel", "Relegion", "Research"};
    private List<Book> allBooks;
    private Set<String> issued;
    private Map<Long, Book> storedBooks;

    public Library(){
        allBooks = new ArrayList<Book>();
        issued = new HashSet<String>();
        storedBooks = new HashMap<Long, Book>();
    }

    public void addBook(Book book, int genereIndex){
        String idS = "";
        long id;
        for(int i = 0; i < 10; i++){
            idS += Integer.toString(new Random().nextInt(0, 9));
        }
        id = Long.parseLong(idS, 10);
        book.setId(id);
        book.setGenere(generes[genereIndex - 1]);
        allBooks.add(book);
        storedBooks.put(id, book);
        System.out.println("Book added successfully. new book id: " + id);
    }

    public void issueBook(long bookId){
        Book chosenBook = storedBooks.get(bookId);
        if (!issued.contains(chosenBook.getTitle())){
            issued.add(chosenBook.getTitle());
            chosenBook.isAvailable = false;
            System.out.printf("The book '%s' has been issued successfully.\n", chosenBook.getTitle());
        }else{
            System.out.println("This book seems to be either already issued or doesn't exist. please check availablity status in display menu");
        }
    }

    public void returnBook(long bookId){
        Book chosenBook = storedBooks.get(bookId);
        if (issued.contains(chosenBook.getTitle())){
            issued.remove(chosenBook.getTitle());
            chosenBook.isAvailable = true;
            System.out.printf("The book '%s' has been return and marked as available.\n", chosenBook.getTitle());
        }else{
            System.out.println("This book seems to be already available. check availability status in display menu.");
        }
    }

    public Book searchBook(long id){
        return storedBooks.get(id);
    }

    public void displayAllAvailableBooks(){
        for(Map.Entry<Long, Book> entry : storedBooks.entrySet()){
            System.out.println(entry.getValue().toString());
        }
    }
}
