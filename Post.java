
public class Post {
    private String user;
    private String title;
    
    public Post(String user, String title){
        this.user = user;
        this.title = title;
    }

    public void printPost(){
        System.out.println("Posted by " + user);
        System.out.println(title.toUpperCase());
    }
}
