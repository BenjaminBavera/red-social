
public class Image extends Post{
    private String image;

    public Image(String user, String title, String image){
        super(user, title);
        this.image = image;
    }

    @Override
    public void printPost(){
        super.printPost();
        System.out.println(image);
    }
}