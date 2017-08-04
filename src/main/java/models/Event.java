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

    String[] foodChoiceArray = {"Snacks", "Appetizers", "Sandwiches"};
    int[] foodPriceArray ={5, 15, 20};
    String[] drinkChoiceArray = {"Water", "PBR", "Champagne", "Full Bar", "Open Bar"};
    int[] drinkPriceArray = {0, 5, 15, 25, 50};
    String[] entertainmentChoiceArray = {"Cousin Vinny", "Bobo the Sad Clown"};
    int[] entertainmentPriceArray = {0, 250};


    public int addCost() {
        for (int i=0; i<foodChoiceArray.length; i++) {
            if(typeFood.equals(foodChoiceArray[i])) {
                totalPrice+=((foodPriceArray[i]*numGuests)+numGuests*10);
            }
        }

        for (int i=0; i<drinkChoiceArray.length; i++) {
            if(typeDrinks.equals(drinkChoiceArray[i])) {
                totalPrice+=(drinkPriceArray[i]*numGuests);
            }
        }

        return totalPrice;
    }



}








