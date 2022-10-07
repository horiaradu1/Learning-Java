public class Library{

    private static Book[] bookList;
    private static int numberOfItems;

    public Library (int n){
        this.bookList = new Book[n];
    }

    public void addBook(Book b) {
        this.bookList[this.numberOfItems] = b;
        this.numberOfItems = this.numberOfItems + 1;
    }

    public void whichBooks() {
        System.out.println("This is the list of books:");
        for(int i = 0; i < this.numberOfItems; i++)
            System.out.println(this.bookList[i].getTitle());

    }

    public void whichAuthors() {
        System.out.println("This is the list of authors:");
        for(int i = 0; i < this.numberOfItems; i++)
            System.out.println(this.bookList[i].getAuthor().getAuthorName());
    }

    public void borrowBook(Book b){
        if(b.getItems()-1 < 0)
            System.out.println(b.getTitle()+" is not available.");
        else{
            System.out.println(b.getTitle()+" has been booked for you.");
            b.setItems(b.getItems()-1);
        }
    }

    public void returnBook(Book b){
        b.setItems(b.getItems()+1);
        System.out.println(b.getTitle()+" was successfully returned");
    }

    public static void main(String[] args){        System.out.println("Starting my new library\n");
        //1. Create library
        Library l= new Library(8);
        //2. Populate library
        // Add 'Oscar Wilde' as a new author
        Author a1 = new Author("Oscar Wilde", 1889);
        //Add three items of 'The Importance of Being Earnest' to the library
        Book b1 = new Book("The Importance of Being Earnest", a1, 3);
        l.addBook(b1);
        //Add two items of 'The Picture of Dorian Gray' to the library
        Book b2 = new Book("The Picture of Dorian Gray", a1, 2);
        l.addBook(b2);        //Add 'Charles Dickens' as a new author
        Author a2 = new Author("Charles Dickens", 1812);
        //Add five items of 'The Picture of Dorian Gray' to the library
        Book b3 = new Book("Oliver Twist", a2, 3);
        l.addBook(b3);
        //3. Explore library
        l.whichBooks();
        l.whichAuthors();
        //4. Interact with the library
        // Borrow Oliver Twist
        l.borrowBook(b3);
        //Return Oliver Twist
        l.returnBook(b3);
        //Borrow more than available
        l.borrowBook(b2);
        l.borrowBook(b2);
        l.borrowBook(b2);
    }
}