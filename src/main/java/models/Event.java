package models;

import java.util.Arrays;

/**
 * Created by Guest on 8/4/7.
 */
public class Event {
    private int guests;
    private String food;
    private String drinks;
    private String entertainment;
    private int price;
    private String coupon;

    public Event(int guests, String food, String drinks, String entertainment, int price, String coupon) {
        this.guests = guests;
        this.food = food;
        this.drinks = drinks;
        this.entertainment = entertainment;
        this.price = price;
        this.coupon = coupon;
    }

    public int getGuests() {
        return guests;
    }

    public String getFood() {
        return food;
    }

    public String getDrinks() {
        return drinks;
    }

    public String getEntertainment() {
        return entertainment;
    }

    public int getPrice() {
        return price;
    }

    public String couponCode(){
        return coupon;
    }
    String[] foodChoiceArray = {"Snacks", "Appetizers", "Sandwiches", "Light Dinner", "Three Course Dinner", "Jamie Oliver Caters"};
    int[] foodPriceArray ={5, 15, 20, 55, 125, 450};
    String[] drinkChoiceArray = {"Water", "PBR", "Champagne", "Full Bar", "Open Bar", "Top Shelf Open Bar"};
    int[] drinkPriceArray = {0, 5, 15, 25, 50, 250};
    String[] entertainmentChoiceArray = {"Cousin Vinny", "Bobo the Sad Clown", "DJ RC", "Live Band", "Weezer", "Adele"};
    int[] entertainmentPriceArray = {0, 250, 750, 2500, 125000, 850000};
    String[] couponCodeArray = {"50Off", "FREEDJ"};

    public int addCost() {
        for (int i = 0; i < foodChoiceArray.length; i++) {
            if (food.equals(foodChoiceArray[i])) {
                price += ((foodPriceArray[i] * guests) + guests * 10);
            }
        }
        for (int i = 0; i < drinkChoiceArray.length; i++) {
            if (drinks.equals(drinkChoiceArray[i])) {
                price += (drinkPriceArray[i] * guests);
            }
        }
        for (int i = 0; i < entertainmentChoiceArray.length; i++) {
            if (entertainment.equals(entertainmentChoiceArray[i])) {
                price += (entertainmentPriceArray[i]);
            }
        }

        if (coupon.equals(couponCodeArray[0])) {
            price -= 50;
        } else if (guests >= 150) {
            price -= 750;
        }
        return price;
    }

}










