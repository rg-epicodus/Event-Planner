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

    public String getEntertainment() {
        return typeEntertainment;
    }

    public int getPrice() {
        return totalPrice;
    }

    String[] foodChoiceArray = {"Snacks"};
    int[] foodPriceArray ={5};




    public int addCost() {
        for (int i=0; i<foodChoiceArray.length; i++) {
            if(typeFood.equals(foodChoiceArray[i])) {
                totalPrice+=((foodPriceArray[i]*numGuests)+numGuests*10);
            }
        }
        return totalPrice;
    }



}








