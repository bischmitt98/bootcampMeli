package oop.oop05.models;

public class Report extends Document {
    private int numPages;
    private String text, author, reviewer;

    public Report(int numPages, String text, String author, String reviewer) {
        this.numPages = numPages;
        this.text = text;
        this.author = author;
        this.reviewer = reviewer;
    }

    @Override
    public String toString() {
        return "Report{" +
                "numPages=" + numPages +
                ", text='" + text + '\'' +
                ", author='" + author + '\'' +
                ", reviewer='" + reviewer + '\'' +
                '}';
    }
}
