public class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return name + " <" + email + ">";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Author)) return false;
        Author author = (Author) obj;
        return name.equals(author.name) && email.equals(author.email);
    }

    public int hashCode() {
        return name.hashCode() + email.hashCode();
    }
}
