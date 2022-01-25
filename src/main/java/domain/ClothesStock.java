package domain;

import domain.enums.ProductSize;
import domain.enums.ProductValid;

// Classe que herda de 'Stock'

public class ClothesStock extends Stock {
    public ClothesStock(String stockName, ProductSize productSize) {
        super(stockName, productSize);
    }

    // Implementaçao do método abstrato que está na classe 'Pai'
    public void productsList() {
        System.out.println("Stock\nName: '" + stockName + "', Code: " + stockCode + ", Model: '" + productSize + "'");
        for (Product prods : products) {
            System.out.println(prods);
        }
    }
}
