package src;

import src.Operations.*;
import java.util.*;
import java.util.Scanner;
import src.Handlers.*;
import src.Input.IngredientsInput;
public class Main {
    private static List<Ingredients> ingredientList;
    private static List<Recipe> recipeList;
    private static List<Ingredients> ingredientsList;


    private static IngredientsInput ingredientsInput;
    private static RecipeHandler recipeHandler;
    public static void main(String[] args) {

        //IngredientsInput.viewIngredints(ingredientList);
        ingredientsInput = new IngredientsInput();
        recipeHandler = new RecipeHandler();

        while (true){

        }

    }

    public static int Display(int choice){
        System.out.println("1 : Available Ingredients: ");
        System.out.println("2 : Order Specific Ingredients");
        System.out.println("3 : View Total Sales");
        System.out.println("4 : View Total Expenses");
        System.out.println("5 : View Net Profit");
        System.out.println("6 : Place Order");
        System.out.println("7 : Exit Program");
        System.out.println("--------Sorry Wrong Entry--------");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
//        while(true){
//            if(choice==1){
//                //IngredientsHandler.viewIngredints(ingredientsList,);
//            }
//
//            else if(choice==2){
//                //RecipeHandler
//            }
//        }
    }
    public static Recipe selectRecipe(){
        System.out.println("Enter Recipe Name: ");
        Scanner sc = new Scanner(System.in);
        String recipeName = sc.nextLine();

        for (int i = 0; i < recipeList.size(); i++) {
            if(recipeList.get(i).getName().equals(recipeName)){
                return recipeList.get(i);
            }
        }
        System.out.println(recipeName+" Not Found...");
        return recipeList.get(10);
    }




}
