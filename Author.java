import java.util.Objects;

public class Author {
     private String authorName1;
    public Author (String name) {
        this.authorName1 = name;
    }

    public String getAuthorName() {
        return authorName1;
    }

    public void setAuthorName(String name) {
        this.authorName1 = name;
    }
    /*   НАПИСАНО ВРУЧНУЮ
    @Override
    public  boolean equals(Object name) {
        Author a = (Author) name;
        return authorName1.equals(a.authorName1);

    }

    @Override
    public String toString() {
        return "автор : " + authorName1;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName1);
    }*/
// СГЕНЕРИРОВАННО
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName1, author.authorName1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName1);
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName1='" + authorName1 + '\'' +
                '}';
    }
}
