package src.Operations;

import java.util.HashMap;

public class PurchaseOrder {
    private double total;
    private HashMap<Ingredients,Double> Order;
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public HashMap<Ingredients, Double> getOrder() {
        return Order;
    }

    public void setOrder(HashMap<Ingredients, Double> order) {
        Order = order;
    }

    public PurchaseOrder(double total, HashMap<Ingredients,Double> Order){
        this.total = total;
        this.Order = Order;
    }
}
