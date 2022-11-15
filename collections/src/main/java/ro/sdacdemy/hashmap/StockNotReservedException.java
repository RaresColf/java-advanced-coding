package ro.sdacdemy.hashmap;

public class StockNotReservedException extends RuntimeException{

    public StockNotReservedException(String message) {
        super(message);
    }
}
