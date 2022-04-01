package src.Operations;

public class Sales {
    private double amount;
    private Order order;

    public Sales(Order order, double amount){
        this.amount = amount;
        this.order = order;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void displaySales(){
        System.out.println("Recipe name: "+this.getOrder().getRecipe().getName());
        System.out.println("Amount is: "+this.getAmount());
    }

}
