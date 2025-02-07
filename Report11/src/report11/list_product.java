
package report11;


public class list_product {
    private String name;
    private int qty;
    private double price;
    private double amount;

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    public list_product(String name, int qty, double price, double amount) {
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.amount = amount;
    }
    
    
}
