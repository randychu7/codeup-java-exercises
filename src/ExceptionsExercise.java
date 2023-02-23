public class ExceptionsExercise {
//    Mini-exercise: Investigate the substring method for String objects in the Java API. Find out what kind of exception it throws. Create a test class with a main method. Set up a try-catch block that defines a string and finds its length. Once you have the length of your string, modify your program so it creates a substring from your original string, but give it an index that doesn't exist so you get the error message.

    public static void main(String[] args) {
        ExceptionsClass ne = new ExceptionsClass();


        try{
//            String newSub = ne.myStr.substring();
            System.out.println(ExceptionsClass.myStr.substring(0, ExceptionsClass.myStr.length()+1));
        }catch (StringIndexOutOfBoundsException iobe){
            System.out.println(iobe.getMessage());
            iobe.getStackTrace();
        };
        System.out.println("ok");
    }

//    Optional: play with the .getMessage and .printStackTrace methods.
//    Optional: what are some other ways you can get the same exception? Try to set up your program so as to produce and catch these exceptions.
}
