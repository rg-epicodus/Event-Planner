import models.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

/**
 * Created by Guest on 8/4/17.
 */

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean programRunning = true;

        try {
            while (programRunning) {
                System.out.println("Welcome to the Event Planner");
                System.out.println("Let us handle all the things. Please select from the following options: Begin Planning, Exit");
                String navChoice = bufferedReader.readLine();
                    if (navChoice.equalsIgnoreCase("Begin Planning")) {
                        System.out.println("***********************************************************");
                        System.out.println("Please enter how many guests will be attending.");
                        int guests = Integer.parseInt(bufferedReader.readLine());
                        if (guests > 250 && guests < 25){
                            System.out.println("***********************************************************");
                            System.out.println("Dreadfully sorry, we have a maximum occupancy of 250 Guests");
                            System.out.println("as well as a minimum occupancy of 25 Guests.");
                            System.out.println("Please check with Uncle Lou's Event Planning Service.");
                            System.out.println("***********************************************************");
                            break;

                        } else if(guests <= 250 && guests >= 25) {
                            System.out.println("***********************************************************");
                            System.out.println("Please enter what food selection you would like.");
                            System.out.println("The choices are Snacks, Appetizers, Sandwiches, Light Dinner, Three Course Dinner, Jamie Oliver Caters");
                            String food = bufferedReader.readLine().toLowerCase();
                            System.out.println("***********************************************************");
                            System.out.println("Please choose what type of drinks you want provided.");
                            System.out.println("The choices are Water, PBR, Champagne, Full Bar, Open Bar, Top Shelf Open Bar");
                            String drinks = bufferedReader.readLine().toLowerCase();
                            System.out.println("***********************************************************");
                            System.out.println("Please choose what type of entertainment you want provided.");
                            System.out.println("The choices are Cousin Vinny, Bobo the Sad Clown, DJ RC, Live Band, Weezer, Adele");
                            String entertainment = bufferedReader.readLine().toLowerCase();
                            System.out.println("***********************************************************");
                            System.out.println("***********************************************************");
                            Event newEvent = new Event(guests, food, drinks, entertainment);
//                        if (!newEvent.partOfArray(food, newEvent.getFoodChoiceArray())) {
//                            System.out.println("We didn't recognize your food choice! We hope to see you again!");
//                            break;
//                        }
//                        if (!newEvent.partOfArray(drinks, newEvent.getDrinksChoiceArray())) {
//                            System.out.println("We didn't recognize your drinks choice! We hope to see you again!");
//                            break;
//                        }
//                        if (!newEvent.partOfArray(entertainment, newEvent.getEntertainmentChoiceArray())) {
//                            System.out.println("We didn't recognize your entertainment choice! We hope to see you again!");
//                            break;
//                        }


                            System.out.println("Your itemized Event Plan Receipt includes the following charges:");
                            System.out.println("Guests total: $" + newEvent.createGuestCost() + " for " + newEvent.getGuests()+ " Guests");
                            System.out.println("Your Meals are: $" + newEvent.createFoodCost() + " for you food choice: " + newEvent.getFood());
                            System.out.println("Your Drinks are: $" + newEvent.createDrinkCost() + " for you drink choice: " + newEvent.getDrinks());
                            System.out.println("Your Entertainment will be: $" + newEvent.createEntertainmentCost()  + " for the performer: " + newEvent.getEntertainment());
                            System.out.println("The total cost of the event is: $" + newEvent.addCost());
                            System.out.println("***********************************************************");
                            System.out.println("***********************************************************");
                            System.out.println("Thank you for your reservation");
                            System.out.println("***********************************************************");
                            break;
                        }

                    } else if (navChoice.equalsIgnoreCase("Exit")) {
                        System.out.println("Farewell Friend!");
                        programRunning = false;
                    } else {
                        System.out.println("Invalid input, try again");
                    }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
