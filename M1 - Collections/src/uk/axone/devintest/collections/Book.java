package uk.axone.devintest.collections;

public class Book implements Comparable<Book> {

    private int bookID;
    private String bookName;

    public Book(int bookID, String bookName){
        this.bookID = bookID;
        this.bookName = bookName;
    }

    public int getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public int compareTo(Book otherBook) {
        if (bookID > otherBook.getBookID()) {
            return 1;
        }

        else if (bookID < otherBook.bookID) {
            return -1;
        }

        else {
            return 0;
        }
    }

}
