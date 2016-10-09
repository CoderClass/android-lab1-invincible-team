package apidez.com.lab1.model;

/**
 * Created by nongdenchet on 10/9/16.
 */

public class Post {
    private String username;
    private String description;
    private String date;
    private String avatar;
    private String image;

    public Post(String username, String description, String date, String avatar, String image) {
        this.username = username;
        this.description = description;
        this.date = date;
        this.image = image;
        this.avatar = avatar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
