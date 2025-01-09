import java.util.ArrayList;
import java.util.Scanner;

public class Pocho {
    private Feed globalFeed;
    private ArrayList<User> users;
    private User currentUser;
    private boolean isLogged;
    private Scanner scanner;

    public Pocho(){
        globalFeed = new Feed();
        users = new ArrayList<>();
        isLogged = false;
        scanner = new Scanner(System.in);
    }
    
    public void createUser(){
        if (isLogged == true) throw new IllegalStateException("You cannot create a user while logged in");
        System.out.println("Enter a username");
        String name = scanner.nextLine();
        //Falta poner que pasa con usuario repetido
        System.out.println("Enter a password");
        String password = scanner.nextLine();
        User user = new User(name, password);
        users.add(user);
        System.out.println("User created succesfully");
    }
    
    public void loggin(){
        if (isLogged == true) throw new IllegalStateException("There is already a user logged in");
        System.out.println("Enter your username");
        String name = scanner.nextLine();
        System.out.println("Enter your password");
        String password = scanner.nextLine();
        boolean correctUser = false;
        boolean correctPassword = false;
        int index = 0;
        while (correctUser == false && correctPassword == false){
            if (users.get(index).getName().equals(name)){ 
                correctUser = true;
                if (users.get(index).getPassword().equals(password)){
                    correctPassword = true;
                    currentUser = users.get(index);
                    isLogged = true;
                    System.out.println("User logged in succesfully");
                    return;
                }
            }
            index++;
        }
        System.out.println("Incorrect username or password");
    }

    public void logOut(){
        if (isLogged == false) throw new IllegalStateException("There is no user logged in");
        currentUser = null;
        isLogged = false;
        System.out.println("User logged out succesfully");
    }        

    public void publicStatus(String title, String text){
        Status statusPost = currentUser.newStatusPost(title, text);
        globalFeed.addPost(statusPost);
    }

    public void showGlobalFeed(){
        globalFeed.showFeed();
    }
}
