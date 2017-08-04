package models;

/**
 * Created by Guest on 8/4/7.
 */
public class Event {
    private int numGuests;
    private String typeFood;
    private String typeDrinks;
    private String typeEntertainment;
    private int totalPrice;

    public Event(int guests, String food, String drinks, String entertainment, int price) {
        numGuests = guests;
        typeFood = food;
        typeDrinks = drinks;
        typeEntertainment = entertainment;
        totalPrice = price;
    }

    public int getGuests() {
        return numGuests;
    }

    public String getFood() {
        return typeFood;
    }

    public String getDrinks() {
        return typeDrinks;
    }
}








