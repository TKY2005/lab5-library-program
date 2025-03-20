/*
 * name: Youssef Mohamed Torki Ahmed
 * ID: 445820246
 * lab5 code
 */


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
                    5- change a book's genere
                    6- display all books in the library
                    7- exit
                    """);
            
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your operation : "); int op = in.nextInt();

            in = new Scanner(System.in);
            switch (op){
                case 1 -> {
                    System.out.print("Enter the book name and author name seperated by a comma (,) : ");
                    String[] input = in.nextLine().trim().split(",");

                    for(int i = 0; i < lib.generes.length; i++)
                        System.out.printf("%d- %s\n", i + 1, lib.generes[i]);
                    System.out.print("Enter the genere : "); int genere = in.nextInt();
                    if (genere > lib.generes.length || genere < 0){
                         System.out.println("Invalid genre index. setting it to default value of undefined.");
                         genere = 1;
                         System.out.println("You can change that in the main menu.");
                    }
                    Book book = new Book(input[0], input[1], true);
                    lib.addBook(book, genere);
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
                    System.out.println(lib.searchBook(id).toString());
                }

                case 5 ->{
                    System.out.print("Enter the book id : "); long id = in.nextLong();

                    for(int i = 0; i < lib.generes.length; i++)
                        System.out.printf("%d- %s\n", i + 1, lib.generes[i]);
                    System.out.print("Enter the genere : "); int genere = in.nextInt() - 1;
                    if (genere > lib.generes.length || genere < 0){
                         System.out.println("Invalid genre index. setting it to default value of undefined.");
                         genere = 0;
                         System.out.println("You can change that in the main menu.");
                    }
                    lib.searchBook(id).setGenere(lib.generes[genere]);
                }

                case 6 -> lib.displayAllAvailableBooks();
                case 7 -> System.exit(0);
            }
        }
    }
}

