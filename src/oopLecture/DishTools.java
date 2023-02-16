package oopLecture;

public class DishTools {

    public static int averageCost = 1300;


    public static String shoutDishName(dish Dish) {
        return String.format("%S",Dish.getNameOfDish());
    }

    public static String analyzeDishCost(dish Dish){
        if (Dish.getCostInCents() < averageCost){
           return String.format("The price of %s is less than the average", Dish.getNameOfDish());
        } else {
            return String.format("The price of %s is more that the average", Dish.getNameOfDish());
        }

    }

    public static boolean flipRecommendation(dish Dish){
        return Dish.setWouldReccomend(!Dish.getwouldReccomend());
    }

    public static String compareDishes(dish Dish1, dish Dish2){
        if (Dish1.getCostInCents() > Dish2.getCostInCents()){
            return String.format("%s is more that %s", Dish1.getNameOfDish(), Dish2.getNameOfDish());
        } else {
            return String.format("%s is less than %s", Dish1.getNameOfDish(), Dish2.getNameOfDish());
        }

    }





}




