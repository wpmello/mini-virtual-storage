package domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class ECommerce {

    protected String name;
    private List<Stock> stocks = new ArrayList<>();

    public ECommerce(String name) {
        this.name = name;
    }

    public void StockList() {
        System.out.println("==========> " + name + " <==========");
        System.out.println("Stock(s):");
                for (Stock stock : stocks) {
                    System.out.println(stock);
                };
    }

    @Override
    public String toString() {
        return "ECommerce = '" + name + "' ";
    }
}
