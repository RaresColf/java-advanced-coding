package ro.sdacdemy.hashmap;

import java.util.Objects;

public class StockItem {
    private String name;
    private double price;
    private int quantityInStock;
    private int reserved;

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.reserved = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public int availableQuantity() {
        return quantityInStock - reserved;
    }

    public void adjustStock(int quantityToAdjust) {
        int newQuantity = this.quantityInStock + quantityToAdjust;
        if (newQuantity >= 0) {
            this.quantityInStock = newQuantity;
        } else {
            System.out.println("Quantity after adjusting cannot be lower than 0.");
        }
    }

    public int reserveStock(int quantityToReserve) throws UnavailableStockException {
        if (quantityToReserve <= availableQuantity()) {
            this.reserved += quantityToReserve;
            return quantityToReserve;
        }
        throw new UnavailableStockException("The quantity that you want to reserve is unavailable");
    }

    public int unreserveStock(int quantityToUnreserve) {
        if (quantityToUnreserve <= this.reserved) {
            this.reserved -= quantityToUnreserve;
            return quantityToUnreserve;
        }
        throw new StockNotReservedException("The quantity that you want to reserved is too big");
    }

    public int finalizeStock(int quantityToFinalize) {
        if (quantityToFinalize <= this.reserved) {
            this.quantityInStock -= quantityToFinalize;
            this.reserved -= quantityToFinalize;
            return quantityToFinalize;
        }
        throw new StockNotReservedException("The stock should be reseverd first");
    }

    @Override
    public String toString() {
        return this.name + " with price " + this.price + " reserved: " + this.reserved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockItem stockItem = (StockItem) o;
        return Double.compare(stockItem.price, price) == 0 && quantityInStock == stockItem.quantityInStock &&
                reserved == stockItem.reserved && name.equals(stockItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantityInStock, reserved);
    }
}
