package domain;

import domain.enums.ProductType;

public class DrinkStock extends Stock {
    public DrinkStock(String stockName, ProductType productType) {
        super(stockName, productType);
    }

    public void productsList() {
        System.out.println("Stock\nName: '" + stockName + "', Code: " + stockCode + ", Model: '" + productType + "'");
        for (Product prods : products) {
            System.out.println(prods);
        }
    }
}
