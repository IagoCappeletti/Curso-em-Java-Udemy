package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS");
        
        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow that's awesome!");
        Post post1 = new Post (sdf.parse("21/01/2023 13:05:44"), "Traveling to new Zealand", "I'm going to visit this wonderful contry!", 12);


        post1.addComment(comment1);
        post1.addComment(comment2);

        Comment comment3 = new Comment("Good night");
        Comment comment4 = new Comment("May the forge be with you");
        Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good nigth guys", "See you tomarrow", 5);

        post2.addComment(comment3);
        post2.addComment(comment4);

        System.out.println(post1);
        System.out.println(post2);
    }

}
