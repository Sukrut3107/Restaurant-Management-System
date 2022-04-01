package src.Handlers;
import src.Operations.*;
import java.util.*;
public class IngredientsHandler {
    public static void viewIngredints(List<Ingredients> ingredientsList){
        for (int i = 0; i < ingredientsList.size(); i++) {
            System.out.println(i);
        }
    }

    public boolean canOrder(Ingredients ingredients, double quantity, double availableAmount){
        if(availableAmount> ingredients.getItemRate()*quantity){
            return true;
        }
        else{
            return false;
        }
    }
}
