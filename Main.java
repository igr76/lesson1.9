public class Main {
    public static void main(String[] args) {
      Book idiot = new Book("Dostoevsky" ,1874);
      Book warAndPice = new Book("Tolstoy" ,1863);
      Author idiot1 = new Author("Dostoevsky");
      Author warAndPice1 = new Author("Tolstoy");
      idiot.setPublishingYear(1879);
      System.out.println("автор и год издания:  " + idiot.getAuthorName() +
              "   " + idiot.getPublishingYear());




}}