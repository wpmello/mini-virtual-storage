package domain;

import domain.enums.ProductModel;

public class ElectronicStock extends Stock {
    public ElectronicStock(String stockName, ProductModel productModel) {
        super(stockName, productModel);
    }

    public void productsList() {
        System.out.println("Stock\nName: '" + stockName + "', Code: " + stockCode + ", Model: '" + productModel + "'");
        for (Product prods : products) {
            System.out.println(prods);
        }
    }
}
