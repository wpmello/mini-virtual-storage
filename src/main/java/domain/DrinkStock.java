package domain;

import domain.enums.ProductType;

// Classe que herda de 'Stock'

public class DrinkStock extends Stock {
    public DrinkStock(String stockName, ProductType productType) {
        super(stockName, productType);
    }

    // Implementaçao do método abstrato que está na classe 'Pai'
    public void productsList() {
        System.out.println("Stock\nName: '" + stockName + "', Code: " + stockCode + ", Model: '" + productType + "'");
        for (Product prods : products) {
            System.out.println(prods);
        }
    }
}
