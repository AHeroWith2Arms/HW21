class Author {
    private String firstName;
    private String lastName;
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Author author1 = new Author("John", "Smith");
        Author author2 = new Author("Emma", "Johnson");
        Book book1 = new Book("The Great Novel", author1, 2000);
        Book book2 = new Book("Fantastic Adventures", author2, 2015);

        System.out.println("Before updating publication year:");
        System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Year: " + book1.getPublicationYear());
        System.out.println("Book 2: " + book2.getTitle() + " by " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", Year: " + book2.getPublicationYear());
        book2.setPublicationYear(2018);

        System.out.println("nAfter updating publication year:");
        System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Year: " + book1.getPublicationYear());
        System.out.println("Book 2: " + book2.getTitle() + " by " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", Year: " + book2.getPublicationYear());
    }
}