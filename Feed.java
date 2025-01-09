import java.util.ArrayList;

public class Feed {
    private ArrayList<Post> posts;

    public Feed(){
        posts = new ArrayList<>();
    }

    public void addPost(Post post){
        posts.add(post);
    }

    public void removePost(Post post){
        posts.remove(post);
    }

    public int quantity(){
        return posts.size();
    }

    public void showFeed(){
        for(int i = posts.size() - 1; i >= 0; i--) {
            posts.get(i).printPost();
            System.out.println("-------------------");
            System.out.println();
        }
    }
}
