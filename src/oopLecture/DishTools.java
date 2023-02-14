package oopLecture;

public class DishTools {


//    Create a class of static members (variables and methods) called DishTools
//  - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 1300
//  - shoutDishName() - that takes in a Dish object and prints out the name in all caps
//  - analyzeDishCost() - that takes in a Dish object and will print out either “More expensive than average” or “Less expensive than average”, depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
//  - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
//    Try out the DishTools methods with Dish objects in the DishTest main method
//    BONUS - add some static methods to the Dish class that compares two dishes in some way
    public static int averageCost = 1300;

    public static String shoutDishName(dish Dish) {
        return String.format("%S",Dish.nameOfDish);
    }

    public static String analyzeDishCost(dish Dish){
        if (Dish.costInCents < averageCost){
           return String.format("The price of %s is less than the average", Dish.nameOfDish);
        } else {
            return String.format("The price of %s is more that the average", Dish.nameOfDish);
        }

    }

    public static boolean flipRecommendation(dish Dish){
        return Dish.wouldReccomend = !Dish.wouldReccomend;
    }

    public static String compareDishes(dish Dish1, dish Dish2){
        if (Dish1.costInCents > Dish2.costInCents){
            return String.format("%s is more that %s",Dish1.nameOfDish, Dish2.nameOfDish);
        } else {
            return String.format("%s is less than %s", Dish1.nameOfDish,Dish2.nameOfDish);
        }

    }





}




