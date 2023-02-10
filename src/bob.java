import java.util.Scanner;

public class bob {
    public static void main(String[] args) {
        System.out.println("Ask Bob a question");
        Scanner sc = new Scanner(System.in);
        String question = sc.nextLine();


        if (question.charAt(question.length() - 1) == '?') {
            System.out.println("Bob: Sure Bitch");
        } else if (question.charAt(question.length() - 1) == '!') {
            System.out.println("Don't YELL AT ME BITCH");
        } else if (question == " "){
            System.out.println("Fine. Be that way BITCH");
        }else{
            System.out.println("Whatever....bitch");
        }

        }


//        if(question1.charAt(question1.length()-1) == '?'){
//            System.out.println("Bob: Sure.");
//        }

    }

}
