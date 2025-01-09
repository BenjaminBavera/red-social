import java.util.ArrayList;

public class User{
    private String name;
    private String password;
    private ArrayList<User> friends;
    private Feed feed;
    
    public User(String name, String password){
        if (name == null || password == null) throw new IllegalArgumentException("Name or Password null");
        this.name = name;
        this.password = password;
        friends = new ArrayList<>();
        feed = new Feed();
    }

    public Status newStatusPost(String title, String text){
        Status statusPost = new Status(name, title, text);
        feed.addPost(statusPost);
        return statusPost;
    }

    public Image newImagePost(String title, String image){
        Image imagePost = new Image(name, title, image);
        feed.addPost(imagePost);
        return imagePost;
    }

    public void showFeed(){
        feed.showFeed();
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }
}


