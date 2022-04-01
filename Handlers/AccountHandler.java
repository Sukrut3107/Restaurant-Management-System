package src.Handlers;

import src.Operations.Expenses;
import src.Operations.Sales;

import java.util.List;

public class AccountHandler {
    public void displaySales(List<Sales> salesList){
        System.out.println("Total Sales: "+salesList.size());

        for (int i = 0; i < salesList.size(); i++) {
            System.out.println(i);
        }
    }

    public void displayExpenses(List<Expenses> expensesList){
        System.out.println("Total Expenses: "+expensesList.size());
        for (int i = 0; i < expensesList.size(); i++) {
            System.out.println(i);
        }
    }

    public void displayProfit(List<Sales> salesList, List<Expenses> expensesList){

    }
}
