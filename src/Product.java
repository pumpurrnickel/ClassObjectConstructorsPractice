public class Product {
    private double cost;
    private int quantity;
    private String productName;

    public Product(double cost, int quantity, String productName) {
        this.cost = cost;
        this.quantity = quantity;
        this.productName = productName;
    }

    public void totalCost() {
        System.out.println("Total cost is " + (cost*quantity));
    }

    public void productInfo() {
        System.out.println(productName + " costs " + cost + " and " + quantity + " units were purchased."); 
    }
}