package example01;

public class AppBook {
    public static void main (String [] args){
        Book book; // first way to declare
        book = new Book(); // first way to declare

        Book book2 = new Book(); // second way to declare

        book.name = "Harry Potter and the Goblet of Fire";
        book.author = "J.K. Rowling";

        book2.name = "The Myth of the Eternal Return: Cosmos and History";
        book2.author = "Mircea Eliade";

        System.out.println("Title: " + book.name);
        System.out.println("Author: " + book.author);

        System.out.println("Title: " + book2.name);
        System.out.println("Author: " + book2.author);

    }
}
