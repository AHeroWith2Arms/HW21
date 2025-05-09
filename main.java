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

    public class Author {
        private String name;
        private String surname;

        public Author(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public String toString() {
            return name + " " + surname;
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Author)) return false;
            Author author = (Author) obj;
            return name.equals(author.name) && surname.equals(author.surname);
        }

        public int hashCode() {
            return name.hashCode() * 31 + surname.hashCode();
        }
    }

    public class Book {
        private String title;
        private Author author;

        public Book(String title, Author author) {
            this.title = title;
            this.author = author;
        }

        public String toString() {
            return title + " by " + author.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Book)) return false;
            Book book = (Book) obj;
            return title.equals(book.title) && author.equals(book.author);
        }

        public int hashCode() {
            return title.hashCode() * 31 + author.hashCode();
        }
    }