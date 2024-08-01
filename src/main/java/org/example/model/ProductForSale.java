package org.example.model;

public abstract class ProductForSale {

    private String type;
    private int price;
    private String description;

    public ProductForSale(String type,int price,String description){
        this.description=description;
        this.price=price<0 ? 0 :price;
        this.type=type;
    }
    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getSalesPrice(int quantity){
        return quantity*price;
    }

    public abstract void showDetails();
}
