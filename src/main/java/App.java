import models.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 8/4/17.
 */
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to the Event Planner");
        boolean programRunning = true;


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
                    System.out.println("Your Event is:");
                    System.out.println(numberOfGuests + " Guests");
                    System.out.println("Your Meals are: " );
                    System.out.println("Your Drinks are: " + drinkChoice);
                    System.out.println("Your Entertainment will be: " + entertainmentChoice);
                    System.out.println("The total cost of the event is: ");
                    System.out.println("Thank you for your reservation");
//                    System.out.println(Event(this.price));

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
