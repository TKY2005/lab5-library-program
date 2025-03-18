import java.util.Scanner;

public class Interface {
    

    public static void main(String[] args) {
        System.out.println("Welcome to the library app.");

        Library lib = new Library();

        while (true){
            System.out.println("""
                    1- add a new book
                    2- issue a book
                    3- return a book
                    4- search for a book
                    5- display all books in the library
                    6- exit
                    """);
            
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your operation : "); int op = in.nextInt();

            in = new Scanner(System.in);
            switch (op){
                case 1 -> {
                    System.out.print("Enter the book name and author name seperated by a comma (,) : ");
                    String[] input = in.nextLine().trim().split(",");
                    Book book = new Book(input[0], input[1], true);
                    lib.addBook(book);
                }

                case 2 ->{
                    System.out.print("Enter the book id : "); long id = in.nextLong();
                    lib.issueBook(id);
                }

                case 3 ->{
                    System.out.print("Enter the book id : "); long id = in.nextLong();
                    lib.returnBook(id);
                }

                case 4 -> {
                    System.out.print("Enter the book id : "); long id = in.nextLong();
                    lib.searchBook(id);
                }

                case 5 -> lib.displayAllAvailableBooks();
                case 6 -> System.exit(0);
            }
        }
    }
}

