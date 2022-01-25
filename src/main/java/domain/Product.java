package domain;

import lombok.Data;

@Data
public class Product {

    private static int PRODUCT_CODE = 1;

    protected Integer productStockCode;
    protected Integer productCode;
    protected String productName;
    protected Integer productQuantity;
    protected Double productUnitPrice;

    public Product(Integer productStockCode,  String productName, Integer productQuantity, Double productPrice) {
        this.productStockCode = productStockCode;
        this.productCode = PRODUCT_CODE++;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productUnitPrice = productPrice;
    }

    public double total(int productQuantity, double productUnitPrice) {
        return productQuantity * productUnitPrice;
    }

    @Override
    public String toString() {
        return "Product: " +
                "stockCode = " + productStockCode +
                ", code = " + productCode +
                ", name = '" + productName + '\'' +
                ", quantity = " + productQuantity +
                ", unit price = " + productUnitPrice +
                ", total price = " + String.format("%.2f", total(productQuantity, productUnitPrice));
    }
}
