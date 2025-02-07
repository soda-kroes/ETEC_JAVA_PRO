/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report2;

/**
 *
 * @author ASUS
 */
public class ProductList {
    private String name;
    private  int qty;
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

    public ProductList(String name, int qty, double price, double amount) {
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.amount = amount;
    }

 
        
    
}
