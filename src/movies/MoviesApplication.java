package movies;
import util.Input;

import java.util.Arrays;
import java.util.Scanner;


public class MoviesApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//
//        for (Movie movie : MoviesArray.findAll()){
//            System.out.println(movie.getName());
//        }

        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
        int userChoice = sc.nextInt();


        if (userChoice == 1){
            System.out.println("View all Movies: ");
            for (Movie movie : MoviesArray.findAll()) {
                System.out.println(movie.getName());
            }
            } else if ( userChoice == 2){
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory() == "animated"){
                    System.out.println(movie.getName() +" "+ movie.getCategory());
                }
            }
        } else if ( userChoice == 3){
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory() == "drama"){
                    System.out.println(movie.getName() +" "+ movie.getCategory());
                }
            }

        }else if ( userChoice == 4){
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory() == "horror"){
                    System.out.println(movie.getName() +" "+ movie.getCategory());
                }
            }
        }else if ( userChoice == 5){
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory() == "scifi"){
                    System.out.println(movie.getName() +" "+ movie.getCategory());
                }
            }

        }

  }
}

