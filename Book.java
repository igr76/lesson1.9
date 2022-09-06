import java.util.Objects;

public class Book {
    private  String authorName;
    private int publishingYear;
    private  Author author;
    public Book (Author author, int year) {
        this.author = author;
        this.publishingYear = year;

    }
    public Author getAuthor() {
        return author;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setAuthorName(String name) {
        this.authorName = name;
    }
    public void setPublishingYear(int name) {
        this.publishingYear = name;
    }
  /*  НАПИСАННО ВРУЧНУЮ
    @Override
    public  boolean equals(Object name) {
        Book m = (Book) name;
        return authorName.equals(m.authorName);

    }
    @Override
    public String toString() {
        return "автор : " + authorName + " год издания : " + publishingYear;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName);
    }*/
// ЭТО СГЕНЕРИРОВАННО
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(authorName, book.authorName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, publishingYear, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", publishingYear=" + publishingYear +
                ", author=" + author +
                '}';
    }
}
