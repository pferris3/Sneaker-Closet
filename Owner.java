import java.util.Scanner;

public class Owner {

    //declare variables
    String name;
    int owner_id;
    String password;
    String matching_password;
    Closet closet;


    //constructs an owner variable
    public Owner(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        System.out.print(":");
        name = scan.nextLine();

        //create a system for random unique identifiers

        //create a password, ask for re-entry, and loop to check for match
        //EDIT FOR CLEANLINESS
        while(password.equals(matching_password) & !password.equals("")) {
            System.out.println("Please enter a password");
            System.out.print(":");
            password = scan.nextLine();

            System.out.println("Please re-enter the password");
            System.out.print(":");
            matching_password = scan.nextLine();

            if(!password.equals(matching_password)){
                System.out.println("");
                System.out.println("The passwords you entered do not match.");
            }

        }

    }

    //recommend sneakers with oldest last_wear dates
    public void recommend(){

    }
}
