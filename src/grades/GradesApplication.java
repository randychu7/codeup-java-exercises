package grades;

import java.util.*;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Bob", new ArrayList<>(Arrays.asList(95.34, 85.34, 55.34)));
        Student student2 = new Student("Sally", new ArrayList<>(Arrays.asList(95.34, 85.34, 55.34)));
        Student student3 = new Student("Jim", new ArrayList<>(Arrays.asList(95.34, 85.34, 55.34)));

        students.put("bobby1", student1);
        students.put("sally1", student2);
        students.put("jimmy5", student3);

        // Welcome message
        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println("\n");

        boolean seeAnother = true;

        while (seeAnother) {
            // Prompt user for student information
            System.out.print("What student would you like to see more information on? ");
            String userInput = scanner.nextLine();

            if (students.containsKey(userInput)) {
                Student student = students.get(userInput);
                System.out.println("Name: " + student.getName() + " - GitHub Username: " + userInput);
                System.out.printf("Current Average: %.2f " ,student.getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + userInput + "\n");
            }

            // Prompt user to see another student's information
            System.out.print("Would you like to see another student? (y/n) ");
            String userResponse = scanner.nextLine();

            if (!userResponse.toLowerCase().startsWith("y")) {
                seeAnother = false;
            }
        }

        // Goodbye message
        System.out.println("\nGoodbye, and have a wonderful day!");
    }
}
