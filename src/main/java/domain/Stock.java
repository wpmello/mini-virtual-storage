package domain;

import domain.enums.ProductModel;
import domain.enums.ProductSize;
import domain.enums.ProductType;
import domain.enums.ProductValid;
import domain.exception.InvalidProduct;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
public abstract class Stock {

    private static int STOCK_CODE = 1;

    protected Integer stockCode;
    protected String stockName;
    protected String productSize;
    protected String productType;
    protected String productModel;
    protected String productValid;

    protected List<Product> products = new ArrayList<>();

    public Stock(String stockName) {
        this.stockName = stockName;
        this.stockCode = STOCK_CODE++;
    }

    public Stock(String stockName, ProductSize productSize) {
        this.stockCode = STOCK_CODE++;
        this.stockName = stockName;
        this.setProductSize(productSize.getDescription());
    }

    public Stock(String stockName, ProductType productType) {
        this.stockCode = STOCK_CODE++;
        this.stockName = stockName;
        this.setProductType(productType.getDescription());
    }

    public Stock(String stockName, ProductModel productModel) {
        this.stockCode = STOCK_CODE++;
        this.stockName = stockName;
        setProductModel(productModel.getDescription());
    }

    public Stock(String stockName, ProductValid productValid) {
        this.stockCode = STOCK_CODE++;
        this.stockName = stockName;
        this.setProductValid(productValid.getDescription());
    }

    public void increment(Product product) {
        if (product.getProductStockCode() == this.stockCode) {
            if (productNameEquals(product.getProductName())) {
                throw new InvalidProduct("Product with name '" + product.getProductName() + "' already exist. Verify it.");
            } else
                this.products.add(product);
        }
    }

    public void decrement(String productName) {
        if (!this.products.isEmpty() && productNameEquals(productName)) {
            this.products.remove(ifProductByNameExist(productName));
        } else
            throw new InvalidProduct("Product with name '" + productName + "' don't exist. Verify it.");
    }

    public void increment(String productName, int quantity) {
        if (productNameEquals(productName)) {
            Product product = ifProductByNameExist(productName);
            int quantityToDecrement = product.getProductQuantity() + quantity;
            product.setProductQuantity(quantityToDecrement);
        }
    }

    public void decrement(String productName, int quantity) {
        if (productNameEquals(productName)) {
            Product product = ifProductByNameExist(productName);
            int quantityToDecrement = product.getProductQuantity() - quantity;
            if (quantityToDecrement >= 0)
                product.setProductQuantity(quantityToDecrement);
            else
                System.out.println("Minimum quantity exceeded! Try again with new value.");
        }
    }

    private boolean productNameEquals(String productName) {
        return this.products.stream()
                .anyMatch(name -> name.getProductName().equalsIgnoreCase(productName));
    }

    private Product ifProductByNameExist(String productName) {
        Product product = this.products.stream()
                .filter(name -> name.getProductName().equalsIgnoreCase(productName))
                .findAny().get();
        return product;
    }

    private Optional<Integer> ifAlreadyExistThenIncrement(Product expectedProduct) {
        Optional<Integer> expectedName = products.stream()
                .filter(product -> product.getProductName().equalsIgnoreCase(expectedProduct.getProductName()))
                .map(productQuantity -> productQuantity.getProductQuantity())
                .reduce((a, b) -> a + b);
        return expectedName;
    }

    public abstract void productsList();

    @Override
    public String toString() {
        return "Name = '" + stockName +
                "', Code = " + stockCode;
    }
}
