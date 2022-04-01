package src.Operations;

import java.util.HashMap;

public class Recipe {
    public Recipe(String name, Double amount, HashMap<Ingredients,Double> Order){
        this.name = name;
        this.amount = amount;
        this.Order = Order;
    }
    private String name;
    private Double amount;
    private HashMap<Ingredients,Double> Order;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public HashMap<Ingredients, Double> getOrder() {
        return Order;
    }

    public void setOrder(HashMap<Ingredients, Double> order) {
        Order = order;
    }

}
