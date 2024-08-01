package org.example.model;

public class Bread extends ProductForSale{
    private boolean isFresh;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    public Bread(String type, int price, String description, boolean isFresh) {
        super(type, price, description);
        this.isFresh=isFresh;
    }

    public boolean isFresh() {
        return isFresh;
    }

    @Override
    public void showDetails(){
        System.out.println("type: "+getType()+" price: "+getPrice()+" description: "+getDescription()+" isFresh: "+isFresh);
    }
}





