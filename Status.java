public class Status extends Post{
    private String text;

    public Status(String user, String title, String text){
        super(user,title);
        this.text = text;
    }

    @Override
    public void printPost(){
        super.printPost();
        System.out.println(text);
    }
}
