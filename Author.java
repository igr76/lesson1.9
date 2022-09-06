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
    }

}
