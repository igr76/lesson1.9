public class Book {
    private  String authorName;
    private int publishingYear;
    private  Author author;
    public Book (String name, int year) {
        this.authorName = name;
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
    }


}
