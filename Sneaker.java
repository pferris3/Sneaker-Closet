import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Sneaker {

    int sneaker_id_count = 1;

    //Declare the variables that compose a sneaker object
    int sneaker_id;
    String brand;
    String silhouette;
    String color;
    int release_year;
    int wear_count;

    //last wear should be in mm/dd/yyyy format
    LocalDate last_wear;
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("mm-dd-yyyy");


    //should be a file address
    String picture;

    //constructor, gather all fields to construct a sneaker
    //FUNCTION TEST PASSED
    public Sneaker(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the brand of your sneaker");
        System.out.print(":");
        this.brand = scan.nextLine();
        System.out.println("Please enter the silhouette of your sneaker");
        System.out.print(":");
        this.silhouette = scan.nextLine();
        System.out.println("Please enter the color of your sneaker");
        System.out.print(":");
        this.color = scan.nextLine();
        System.out.println("Please enter the release year of your sneaker");
        System.out.print(":");
        this.release_year = scan.nextInt();

        //take in last wear date as string, format and convert to LocalDate type
        //add precautions for input error
        System.out.println("Please enter the last wear of your sneaker (mm-dd-yyyy)");
        System.out.print(":");
        String last_wear_string = scan.nextLine();
        this.last_wear = LocalDate.parse(last_wear_string);




        //assign sneaker_id
        sneaker_id = sneaker_id_count;
        sneaker_id_count++;

        //gotta work out the details for smoothly obtaining picture address
    }

    //this function will display a picture of the sneaker, brand, silhouette, and release year
    // FUNCTION TEST PASSED
    public void display(){
        //format it
        //print the picture
        //write a file not found exception


        System.out.println(brand + " " + silhouette + " (" + release_year + ")");
        System.out.println("Last wear: " + dateTimeFormatter.format(last_wear));

    }


    //this function will take a filename as a String parameter and assign it to the sneaker attribute "picture"
    public void add_picture(String newpic){

        this.picture = newpic;
        //File file = new File(newpic);
    }

    public LocalDate get_last_wear() {
        return last_wear;
    }

    public void update_last_wear(){
        //LocalDate localDate =
        last_wear = LocalDate.now();
        wear_count++;
    }

    //hope that works lol
    public void print_last_wear(){
        System.out.println(dateTimeFormatter.format(last_wear));
    }

    public int getSneaker_id() {
        return sneaker_id;
    }

    public String get_sneaker_color(){
        return color;
    }

    //add functions to edit incorrect field entries

}


