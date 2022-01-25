package domain;

import domain.enums.ProductValid;

public class FoodStock extends Stock{

    public FoodStock(String stockName, ProductValid productValid) {
        super(stockName, productValid);
    }

    public void productsList() {
        System.out.println("Stock\nName: '" + stockName + "', Code: " + stockCode + ", Model: '" + productValid + "'");
        for (Product prods : products) {
            System.out.println(prods);
        }
    }
}
