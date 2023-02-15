package oopLecture;


public class dishTest {




    public static void main(String[] args) {
         dish dish1 = new dish();
         dish1.costInCents= 1000;
         dish1.nameOfDish = "Chicken";
         dish1.wouldReccomend = false;

        dish dish2 = new dish();
        dish2.costInCents= 2000;
        dish2.nameOfDish = "Beef Burger";
        dish2.wouldReccomend = false;

//         dish1.printSummary();
//         dish2.printSummary();
//
//        System.out.println(DishTools.shoutDishName(dish1));
//        System.out.println(DishTools.analyzeDishCost(dish2));
//        System.out.println(DishTools.flipRecommendation(dish2));
          System.out.println(DishTools.compareDishes(dish1,dish2));


    }
}
