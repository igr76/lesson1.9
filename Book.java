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

}
