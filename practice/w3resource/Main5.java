package practice.w3resource;
import java.util.ArrayList;

public class Main5 {
  public static void main(String[] args) {
    Book book1 = new Book("Book 1", "Suraj 1", "ISBN 1");
    Book.addBook(book1);
    System.out.println(Book.getCollection());
    Book book2 = new Book("Book 2", "Suraj 2", "ISBN 2");
    Book.addBook(book2);
    System.out.println(Book.getCollection());
    Book.removeBook(book2);
    System.out.println(Book.getCollection());
  }
}

class Book {
  private String title;
  private String author;
  private String isbn;
  private static ArrayList<Book> collection = new ArrayList<>();

  public Book(String title, String author, String isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public static void addBook(Book book) {
    Book.collection.add(book);
  }

  public static void removeBook(Book book) {
    Book.collection.remove(book);
  }

  public static ArrayList<Book> getCollection() {
    return collection;
  }
}