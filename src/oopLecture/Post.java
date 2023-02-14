package oopLecture;

import java.util.Date;

public class Post {

    /*
      int id
      String title
      String content
      String author
      Date created_at
     */

    public int id;
    public String title;
    public String content;
    public String author;
    public Date created_at;

    public String returnAuthorDateMessage() {
        return String.format("This post was created by %s on %s", author, created_at);
    }

//    @Override
//    public String toString() {
//        return "Post{" +
//            "id=" + id +
//            ", title='" + title + '\'' +
//            ", content='" + content + '\'' +
//            ", author='" + author + '\'' +
//            ", created_at=" + created_at +
//            '}';
//    }



    public static void main(String[] args) {
        Post post1 = new Post();
        post1.id = 1;
        post1.title = "Day in the Life";
        post1.content = "It happens every day...";
        post1.author = "Overlord";
        post1.created_at = new Date();

        Post post2 = new Post();
        post2.id = 2;
        post2.title = "A Day";
        post2.content = "It happens...";
        post2.author = "Mr. Overlord";
        post2.created_at = new Date();


        System.out.println(post1.returnAuthorDateMessage());
        System.out.println(post2.returnAuthorDateMessage());

//        System.out.println(post1);
//
//        System.out.println(post1.title);
//        Post p = post1;
//        p.title = "LOL";
//        System.out.println(post1.title);
//
//
//        System.out.println(p);

//        System.out.println(post2);

    }


}
