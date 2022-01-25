package domain;

import domain.enums.ProductValid;

// Classe que herda de 'Stock'

public class FoodStock extends Stock{

    public FoodStock(String stockName, ProductValid productValid) { super(stockName, productValid); }

    // Implementaçao do método abstrato que está na classe 'Pai'
    public void productsList() {
        System.out.println("Stock\nName: '" + stockName + "', Code: " + stockCode + ", Model: '" + productValid + "'");
        for (Product prods : products) {
            System.out.println(prods);
        }
    }
}
