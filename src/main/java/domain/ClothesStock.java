package domain;

import domain.enums.ProductSize;
import domain.enums.ProductValid;

public class ClothesStock extends Stock {
    public ClothesStock(String stockName, ProductSize productSize) {
        super(stockName, productSize);
    }

    public void productsList() {
        System.out.println("Stock\nName: '" + stockName + "', Code: " + stockCode + ", Model: '" + productSize + "'");
        for (Product prods : products) {
            System.out.println(prods);
        }
    }
}
