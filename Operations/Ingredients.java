package src.Operations;

public class Ingredients {
    public Ingredients(String name, double quantity, double itemRate){
        this.name = name;
        this.quantity = quantity;
        this.itemRate = itemRate;

    }
    private String name;
    private double quantity;
    private double itemRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getItemRate() {
        return itemRate;
    }

    public void setItemRate(double itemRate) {
        this.itemRate = itemRate;
    }

}
