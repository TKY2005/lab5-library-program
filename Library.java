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
    public String[] generes = {"History", "Fiction", "Philosophy", "Science", "Novel", "Relegion", "Research"};
    public List<Book> allBooks;
    public Set<String> issued;
    public Map<Integer, Book> storedBooks;

    public Library(){
        allBooks = new ArrayList<Book>();
        issued = new HashSet<String>();
        storedBooks = new HashMap<Integer, Book>();
    }

    public void addBook(Book book){
        String idS = new String();
        int id;
        for(int i = 0; i < 10; i++){
            idS += Integer.toString(new Random().nextInt(0, 9));
        }
        id = Integer.parseInt(idS);
        allBooks.add(book);
        storedBooks.put(id, book);
    }

    public void issueBook(int bookId){
        Book chosenBook = storedBooks.get(bookId);
        issued.add(chosenBook.getTitle());
        chosenBook.isAvailable = false;
    }

    public void returnBook(int bookId){
        Book chosenBook = allBooks.get(bookId);
        issued.remove(chosenBook.getTitle());
        chosenBook.isAvailable = true;
    }

    public void displayAllAvailableBooks(){
        for(Map.Entry<Integer, Book> entry : storedBooks.entrySet()){
            System.out.println(entry.getValue().toString());
        }
    }
}
