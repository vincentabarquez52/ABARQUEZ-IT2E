
package abarquezz.it2e;

public class Product {
   
    private int id;
    private String name;
    private int stockQuantity;
    private String category;
    private double pricePerUnit;

    public Product(int id, String name, int stockQuantity, String category, double pricePerUnit) {
        this.id = id;
        this.name = name;
        this.stockQuantity = stockQuantity;
        this.category = category;
        this.pricePerUnit = pricePerUnit;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public String getCategory() {
        return category;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
    

