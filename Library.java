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
}
