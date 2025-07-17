public class Library {
  private String libName;
  private String libAddress;
  private Book [] books = new Book[1950];
  private int totalBook;

  Library() {}
  Library(String libName, String libAddress) {
    this.libName = libName;
    this.libAddress = libAddress;
  }

  public void showLibInfo() {
    System.out.println("Library Name: " + this.libName);
    System.out.println("Library Address: " + this.libAddress);

    for(int i = 0; i < this.books.length ; i++) {
      if(this.books[i] != null) {
        this.books[i].showInfo();
      }
    }
  }

  public void addNewBook(Book book) {
    books[totalBook] = book;
    totalBook++;
  }

  public void addNewBookCopy(Book book, int copy) {
    book.addBookCopy(copy);
  }

  public static void main(String args[]) {
    Library L = new Library("UGC Library", "Bangladesh");
    Book B1 = new Book("Math", "Mr.Karim", "1233", "pdf", 1);
    Book B2 = new Book("Physics", "Mr.Rahim", "1236", "pdf", 1);

    L.addNewBook(B1);
    L.addNewBook(B2);

    L.addNewBookCopy(B1, 12);
    L.addNewBookCopy(B2, 25);

    L.showLibInfo();
  }


}
