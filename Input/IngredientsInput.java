package src.Input;
import src.Operations.*;
import src.Handlers.*;
import java.util.*;
public class IngredientsInput {


    public static void viewIngredints(List<Ingredients> ingredientsList) {
        ingredientsList.add(0,new Ingredients("Tomato",10,50));
        ingredientsList.add(1,new Ingredients("Potato",5,30));
        ingredientsList.add(2,new Ingredients("Onions",4,45));
        ingredientsList.add(3,new Ingredients("Batter",2,90));
        ingredientsList.add(4,new Ingredients("Spices",3,100));
        ingredientsList.add(5,new Ingredients("Milk",2,50));
        ingredientsList.add(6,new Ingredients("CoffeePowder",7,30));
        ingredientsList.add(7,new Ingredients("TeaLeaves",6,40));
        ingredientsList.add(8,new Ingredients("Oregano",3,10));
        ingredientsList.add(9,new Ingredients("Cheese",4,150));
        ingredientsList.add(10,new Ingredients("Yoghurt",2,30));
        ingredientsList.add(11,new Ingredients("Bread",30,3));
        ingredientsList.add(12,new Ingredients("Capsicum",2,10));

        //Dsiplay the list
        for (int i = 0; i < ingredientsList.size(); i++) {
            System.out.println(i);
        }

    }
}
