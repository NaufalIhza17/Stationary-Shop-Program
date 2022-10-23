public class Products {

    private float price;
    public String shelfPosition;

    public Products(float price, String shelfPosition) {
        this.setPrice(price);
        this.shelfPosition = shelfPosition;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void printProducts() {
        System.out.print("Price: " + this.price + "Shelf Position: " + this.shelfPosition);
    }

    public String getProductName() {
        return (this.shelfPosition);
    }

}
