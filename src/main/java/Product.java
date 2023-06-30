public class Product {
    private final String name;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    private final float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

}
