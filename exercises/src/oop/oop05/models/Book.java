package oop.oop05.models;

public class Book extends Document {
    private int numPages;
    private String author, title, genre;

    public Book(int numPages, String author, String title, String genre) {
        this.numPages = numPages;
        this.author = author;
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "numPages=" + numPages +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
