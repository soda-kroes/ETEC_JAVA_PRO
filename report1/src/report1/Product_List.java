

package report1;
public class Product_List {
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
    //constructor

    public Product_List(String name, int qty, double price, double amount) {
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.amount = amount;
    }
    
    
}
