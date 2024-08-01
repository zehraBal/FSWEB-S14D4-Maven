package org.example.model;

public class Chocolate extends ProductForSale{

    private boolean isMilky;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, int price, String description, boolean isMilky) {
        super(type, price, description);
        this.isMilky = isMilky;
    }

    public boolean isMilky() {
        return isMilky;
    }

    @Override
    public void showDetails(){
        System.out.println("type: "+getType()+" price: "+getPrice()+" description: "+getDescription()+" isMilky: "+isMilky);
    }
}
