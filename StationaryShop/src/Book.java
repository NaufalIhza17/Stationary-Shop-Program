//Buku & Kertas

public class Book extends Products {
    public String bookType;
    public String bookName;
    public String bookSequence;

    public Book(float price, String shelfPosition, String bookType, String bookName) {
        super(price, shelfPosition);
        this.bookType = bookType;
        this.bookName = bookName;
    }

    public Book(float price, String shelfPosition, String bookType, String bookName, String bookSequence) {
        super(price, shelfPosition);
        this.bookType = bookType;
        this.bookName = bookName;
        this.bookSequence = bookSequence;
    }

    @Override
    public void printProducts() {
        System.out.println("Name: " + this.bookName + "\nType: " + this.bookType + "\nPrice: " + this.getPrice());
    }

    @Override
    public String getProductName() {
        return (this.bookName);
    }
}
