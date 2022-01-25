package domain;

import domain.enums.ProductModel;

// Classe que herda de 'Stock'

public class ElectronicStock extends Stock {
    public ElectronicStock(String stockName, ProductModel productModel) {
        super(stockName, productModel);
    }


    // Implementaçao do método abstrato que está na classe 'Pai'
    public void productsList() {
        System.out.println("Stock\nName: '" + stockName + "', Code: " + stockCode + ", Model: '" + productModel + "'");
        for (Product prods : products) {
            System.out.println(prods);
        }
    }
}
