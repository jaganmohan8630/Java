class bookslibrary{
    String books[];
    int no_of_books;

    bookslibrary(){
        this.books = new String[100];
        this.no_of_books=0;
    }
    void addbook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book +" has been added");
    }
    void showbooks(){
        System.out.println("Available books are:");
        for(String i:books){
            if(i==null){
                continue;
            }
            System.out.println(i);
        }
    }
    void issuebook(String book){
        for(int i=0;i<books.length;i++){
            if(this.books[i].equals(book)){
                System.out.printf("The %s book has been issued",books[i]);
                this.books[i]=null;
                return;
            }
        }
    }
    void returnbook(String book){
        // addbook(book);
        for(int i=0;i<books.length;i++){
            if(this.books[i]==null){
                System.out.printf("The %s book has been returned\n",books[i]);
                this.books[i]=book;
                return;
            }
        }
    }
}

public class library {
    public static void main(String[] args) {
        bookslibrary bl= new bookslibrary();
        bl.addbook("Think and grow rich");
        bl.addbook("jagan");
        bl.addbook("try...");
        bl.showbooks();
        bl.issuebook("jagan");
        bl.showbooks();
        bl.returnbook("jagan");
        bl.showbooks();
    }
}