package oop.oop05;

import oop.oop05.interfaces.Printable;
import oop.oop05.models.Book;
import oop.oop05.models.Person;
import oop.oop05.models.Report;
import oop.oop05.models.Resume;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(24,"Bianca", "10101010101", "48484848484");
        Book book = new Book(450,"J.K. Rowling", "Harry Potter and the Goblet of Fire", "Fantasy");
        Resume resume = new Resume(person1, new String[]{"Java", "Angular", "MySQL"});
        Report report = new Report(12, "Bootcamp report ...", "Bianca Klein Schmitt", "Eduardo Eller");

        Printable.printDocument(book);
        Printable.printDocument(resume);
        Printable.printDocument(report);
    }
}
