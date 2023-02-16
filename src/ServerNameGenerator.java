import java.util.Random;

public class ServerNameGenerator {

//    public static ServerNameGenerator[] generateName(ServerNameGenerator[] adj, ServerNameGenerator[] noun){
//      String index = ServerNameGenerator.nextInt(adj.length);
//    };

    public static String generateName(String[] adjArray, String[] nounArray){
        Random random = new Random();
        int randomName = random.nextInt(9);
        int randomName1 = random.nextInt(9);


        return String.format( "Your server name is %s %s ",adjArray[randomName],nounArray[randomName1]);
    }

    public static String[] adjArray = {
            "Beautiful",
            "Mysterious",
            "Joyful",
            "Courageous",
            "Serene",
            "Playful",
            "Intriguing",
            "Majestic",
            "Passionate",
            "Vibrant"
    };

    public static String[] nounArray = {
            "Dog",
            "Car",
            "Book",
            "Table",
            "House",
            "Water",
            "Tree",
            "Phone",
            "Chair",
            "Sun"
    };

    public static void main(String[] args) {
        System.out.println(generateName(adjArray,nounArray));

}


}
