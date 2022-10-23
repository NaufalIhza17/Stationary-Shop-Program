// Alat Tulis

public class Stationary extends Products {

    public String stationaryType;
    public String stationaryBrand;

    public Stationary(float price, String shelfPosition, String stationaryType, String stationaryBrand) {
        super(price, shelfPosition);
        this.stationaryType = stationaryType;
        this.stationaryBrand = stationaryBrand;
    }

    @Override
    public void printProducts() {
        System.out.println("Type: " + this.stationaryType + "\nBrand: " + this.stationaryBrand + "\nPrice: " + this.getPrice());
    }

    @Override
    public String getProductName() {
        return (this.stationaryBrand);
    }

}
