package oopLecture;


public class dishTest {


    public static void main(String[] args) {

        dish dish1 = new dish(1000, "chicken" , false);
        dish dish2 = new dish(1500, false);


         dish1.printSummary();
        System.out.println("=========================");
         dish2.printSummary();

//        System.out.println(dish1);
//        System.out.println(DishTools.shoutDishName(dish1));
//        System.out.println(DishTools.shoutDishName(dish2));
//        System.out.println(DishTools.analyzeDishCost(dish2));
        System.out.println(DishTools.flipRecommendation(dish2));
//          System.out.println(DishTools.compareDishes(dish1,dish2));


    }
}
