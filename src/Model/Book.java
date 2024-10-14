package Model;

public class Book {
    private int id;
    private String title;
    private String publishedYear;
    private Author author;

    public Book(String title, int id, String publishedYear, Author author) {
        this.title = title;
        this.id = id;
        this.publishedYear = publishedYear;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String bookInfo() {
        return id +" "+ title +" "+  publishedYear+" " + author.getName()+" "+author.getEmail() ;
    }
}
