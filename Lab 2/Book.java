public class Book{

    private String title;
    private Author author;
    private int items;

    public Book (String t, Author a, int i){
        this.title = t;
        this.author = a;
        this.items = i;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getItems() {
        return items;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public void setAuthor(Author a) {
        this.author = a;
    }

    public void setItems(int i) {
        this.items = i;
    }
}