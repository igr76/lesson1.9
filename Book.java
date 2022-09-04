public class Book {
    private  String authorName;
    private int publishingYear;
    public Book (String name, int year) {
        this.authorName = name;
        this.publishingYear = year;
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
