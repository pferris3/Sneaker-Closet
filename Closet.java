import java.util.*;

public class Closet {

    //declare variables that compose a closet object
    String owner;
    List<Sneaker> sneakers;
    int sneaker_count;

    //establish arrays for selected/sorted sneakers maybe?
    List<Sneaker> color_selected_sneakers;
    List<Sneaker> sorted_sneaker;


    //closet constructor
    public Closet(){

    }

    //updates quantity of sneakers in closet
    public int getSneaker_count() {
        sneaker_count = sneakers.size();
        return sneaker_count;
    }

    //function should allow for creation of a new sneaker and add it to closet
    public void addSneaker(){
        Sneaker newSneaker;
        newSneaker = new Sneaker();
        sneakers.add(newSneaker);
    }

    public void removeSneaker(Sneaker sneaker){
        sneakers.remove(sneaker);
    }


    //work an input for either a button or user
    //function will take in a String (color) that selects sneakers of that color
    public void sneaker_color_select(String color){
         String selected_color = color;
         List<Sneaker> temp_sneakers =  null;
         Sneaker temp_sneaker;
         for(int i = 0; i < sneakers.size(); i++){
             temp_sneaker = sneakers.get(i);
             if(temp_sneaker.get_sneaker_color().equalsIgnoreCase(selected_color)){
                 temp_sneakers.add(temp_sneaker);
             }
         }
         color_selected_sneakers = temp_sneakers;
    }


    //sort sneakers by last_wear, oldest date to most recent
    //write a sorting algorithm
    //MIGHT BE RIGHT NOW 
    public void sort_by_last_wear(){
        List<Sneaker> temp_sneakers = null;
        Sneaker temp_sneaker;

        for(int i = 0; i < (sneakers.size()-1); i++){
            temp_sneaker = sneakers.get(i);
            for(int j = (i+1); j <sneakers.size(); j++){
                if(temp_sneaker.get_last_wear().isAfter(sneakers.get(j).get_last_wear())){
                    temp_sneaker = sneakers.get(j);
                }

                temp_sneakers.set(i, temp_sneaker);
            }

            //HERE?
            sorted_sneaker = temp_sneakers;
        }

        //OR HERE?
        //sorted_sneaker = temp_sneakers;
        //temp_sneakers.clear();
    }
}
