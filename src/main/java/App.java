import models.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Guest on 8/4/17.
 */
public class App {
    public static void main(String[] args) {
        boolean programRunning = true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to the Event Planner");

        Event guests = new Event(150);
        Event food = new Event("Snacks", "Appetizers", "Sandwiches", "Light Dinner", "Three Course Dinner", "Jamie Oliver Caters");
        Event drinks = new Event("Water", "PBR", "Champagne", "Full Bar", "Open Bar", "Top Shelf Open Bar");
        Event entertainment = new entertainment("Cousin Vinny", "Bobo the Sad Clown", "DJ RC", "Live Band", "Weezer", "Adele");

        ArrayList<Event> userEvent = new ArrayList<Event>();
        userEvent.add(guests);
        userEvent.add(food);
        userEvent.add(drinks);
        userEvent.add(entertainment);


        while (programRunning) {
            System.out.println("Let us handle all the things. Please select from the following options: Begin Planning, Exit");
            try {
                String navChoice = bufferedReader.readLine();



                if (navChoice.equals("Begin Planning")) {
                    System.out.println("Please enter how many guests will be attending");
                    Integer numberOfGuests = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Please enter what food selection you would like.");
                    System.out.println("The choices are Snacks, Appetizers, Sandwiches, Light Dinner, Three Course Dinner, Jamie Oliver Caters");
                    String foodChoice = bufferedReader.readLine();
                    System.out.println("Please choose what type of drinks you want provided");
                    System.out.println("The choices are Water, PBR, Champagne, Full Bar, Open Bar, Top Shelf Open Bar");
                    String drinkChoice = bufferedReader.readLine();
                    System.out.println("Please choose what type of entertainment you want provided");
                    System.out.println("The choices are Cousin Vinny, Bobo the Sad Clown, DJ RC, Live Band, Weezer, Adele");
                    String entertainmentChoice = bufferedReader.readLine();
//                    Event userEvent = new Event(guests, food, drinks, entertainment);
                    System.out.println("Your Event is:");
                    System.out.println(guests + " Guests");
                    System.out.println("Your Meals are: " + food);
                    System.out.println("Your Drinks are: " + drinks);
                    System.out.println("Your Entertainment will be: " + entertainment);
                    System.out.println("The total cost of the event is: ");
                    System.out.println("Thank you for your reservation");


                } else if (navChoice.equals("Exit")) {
                    System.out.println("Farewell Friend!");
                    programRunning = false;
                } else {
                    System.out.println("Invalid input, try again");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
