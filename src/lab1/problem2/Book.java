package lab1.problem2;

public class Book {
    public enum Genre {
        FICTION, NON_FICTION, SCIENCE, HISTORY, FANTASY
    }

    private final String title;
    private final String isbn;
    private Genre genre;
    private static int totalBooks;
    public static final String LIBRARY_NAME = "National Library of Kazakhstan Republic";

    {
        totalBooks++;
    }

    public Book(String title, String isbn, Genre genre) {
        this.title = title;
        this.isbn = isbn;
        this.genre = genre;
    }

    public Book(String title) {
        this(title, "Unknown", Genre.FICTION);
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void read() {
        System.out.println("Reading " + this.title);
    }

    public void read(int pageNumber) {
        System.out.println("Reading " + this.title + " at page " + pageNumber);
    }

    public static int getTotalBooks() {
        return totalBooks;
    }
}
