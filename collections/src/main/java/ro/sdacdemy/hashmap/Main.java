package ro.sdacdemy.hashmap;

import ro.sdacdemy.hashmap.StockItem;
import ro.sdacdemy.hashmap.StockManager;

/**
 * /*
 * * Create a class StockItem that has a "name" which is a String and "price" which is a double
 * a "quantityInStock" which is an int and a "reserved" which is also an int
 * <p>
 * The class should contain the following methods:
 * - a constructor that takes name, price and quantityInStock as parameters and initialize the fields and (reserved is initialized with 0)
 * - getName() - getter for name
 * - getPrice() - getter for price
 * - setPrice(price) - setter for price (the price is set if and only if the new price is grater then 0.0)
 * - availableQuantity() - returns the available quantity by subtracting "reserved" from quantityInStock
 * - adjustStock(quantity) - adjust the quantityInStock (it could add or subtract also) - check if the new quantity will be greater or equal to 0
 * - reserveStock(quant) - check if quant is lower or equal to availableQuantity() and if it is then add the quant to reserved (return reserved quant)
 * - unreserveStock(quant) - check if quant is lower or equal the reserved and if it is then subtract quant from reserved (return unreserved quant)
 * - finalizeStock(quant) - check if quant is lower or equal then reserved and if it is then subtract quant from quantityInStock and also subtract it from reserved (return quant)
 * - equals() - override for hashmap
 * - hashcode() - override for hashmap
 * - toString() - override
 * <p>
 * <p>
 * * Create a class StockManager which has only one field (instance variable) which is a final Map<String, StockItem>
 * <p>
 * The class should contain the following methods:
 * - a constructor which don't take any parameter but initialize the map with a new HashMap<>()
 * - addStock(StockItem item) - check if item is not null, then check if the key (item name) already exists in the map,
 * if exists adjustQuantity() if not add the item to the list by putting the name as key and item as value
 * - reserveStock(String item, int quant) - check if the item is in the map (by checking the key), check if quant is grater then 0
 * if the item is in the map and quant is grater then 0 then call the method reserveStock(quant) for that item
 * - sellStock(String item, int quant) - check if the item is in the map (by checking the key), check if quant is grater then 0
 * if the item is in the map and quant is grater then 0 then call the method finalizeStock(quant) for that item
 * - unreserveStock(String item, int quant) - check if the item is in the map (by checking the key), check if quant is grater then 0
 * if the item is in the map and quant is grater then 0 then call the method unreserveStock(quant)
 * - get(String key) - returns if a StockItem is in the map (map.get(key))
 * - toString() - override to print the stock list (use map.entrySet() to iterate through map entries)
 * The to string should return:
 * "Stock List:
 * milk : price 1.26. reserved: 0. There are 6306 in stock. Value of items: 7945.56
 * Total stock value 7945.56"
 */


public class Main {


    public static void main(String[] args) throws UnavailableStockException {

        StockManager manager = new StockManager();

        manager.addStock(new StockItem("milk", 26, 250));
        manager.addStock(new StockItem("egg", 10, 150));
        manager.addStock(new StockItem("bread", 6, 50));

        manager.addStock(new StockItem("milk", 26, 500));


        manager.reserveStock("egg", 25);


        manager.unreserveStock("egg", 5);

        manager.sellStock("egg", 20);

        manager.reserveStock("egg",10000);

        manager.sellStock("milk", 100);
        System.out.println(manager);

    }
}
