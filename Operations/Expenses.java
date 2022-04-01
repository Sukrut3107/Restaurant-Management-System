package src.Operations;

public class Expenses {
    private double amount;
    private PurchaseOrder purchaseOrder;

    public Expenses(double amount, PurchaseOrder purchaseOrder){
        this.amount = amount;
        this.purchaseOrder = purchaseOrder;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public void displayExpenses(){
        System.out.println("Amount :"+this.getAmount());
    }
}
