package oopLecture;

public class DishTools {

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




