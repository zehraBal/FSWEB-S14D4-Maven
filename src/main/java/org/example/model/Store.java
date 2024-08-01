package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale chocolate =new Chocolate("Choco",10,"Tasty choco fot he best customers only");
        ProductForSale bread =new Bread("bread",100,"the best loaf of bread ou will ever eat");
        ProductForSale coke =new Coke("coke",150,"the best coke int he market");
        ProductForSale[] products={chocolate,bread,coke};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }

    }
}