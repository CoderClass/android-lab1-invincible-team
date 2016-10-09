package apidez.com.lab1.utils;

import java.util.ArrayList;
import java.util.List;

import apidez.com.lab1.model.Post;

/**
 * Created by nongdenchet on 10/9/16.
 */

public class Data {

    public static List<Post> posts() {
        String des = "A drawable resource is a general concept for a graphic that can be drawn to the screen." +
                " Drawables are used to define shapes, colors, borders, gradients, etc. " +
                "which can then be applied to views within an Activity.";
        List<Post> post = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            post.add(new Post("User " + i, des, "12/08/2016",
                    "https://unsplash.it/200/200/?image=" + i,
                    "https://unsplash.it/480/320/?image=" + (200 - i)));
        }
        return post;
    }
}
