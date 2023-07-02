package b2021Aviv.ex3;

public class Book {
    private String name;
    private String author;
    private int pages;
    public boolean isSameBook(Book b){
        return b.author.equals(this.author) && b.name.equals(this.name);

    }
}
