package ro.sdacdemy.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StockManager {
    private final Map<String, StockItem> map;

    public StockManager() {
        this.map = new HashMap<>();
    }

    public void addStock(StockItem item) {
        if (item != null) {
            StockItem inStock = map.get(item.getName());
            if (inStock != null) {
                inStock.adjustStock(item.availableQuantity());
            } else {
                map.put(item.getName(), item);
            }
        }
    }

    public int reserveStock(String item, int quantity) throws UnavailableStockException {
        StockItem inStock = map.get(item);
        if (inStock != null && quantity > 0) {
            try{
                inStock.reserveStock(quantity);
            }catch (UnavailableStockException exception){
                System.err.println(exception.getMessage());
            }
        }
        return 0;
    }

    public int unreserveStock(String item, int quantity) {
        StockItem inStock = map.get(item);
        if (inStock != null && quantity > 0) {
            return inStock.unreserveStock(quantity);
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = map.get(item);
        if (inStock != null && quantity > 0) {
            try{
                return inStock.finalizeStock(quantity);
            }catch (RuntimeException ex){
                System.err.println(ex.getMessage());
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        String s = "Stock list: \n";
        for (Map.Entry<String, StockItem> item : map.entrySet()) {     // iteram prin mapa
            StockItem value = item.getValue();
            s = s +"\t" +value + ". There are " + value.availableQuantity() + " available products " +  "\n";
        }
        return s;
    }
}