package models;

import java.util.Arrays;

/**
 * Created by Guest on 8/4/7.
 */
public class Event {
    private int numGuests;
    private String typeFood;
    private String typeDrinks;
    private String typeEntertainment;
    private int totalPrice;
    private String typeCoupon;

    public Event(int guests, String food, String drinks, String entertainment, int price, String coupon) {
        numGuests = guests;
        typeFood = food;
        typeDrinks = drinks;
        typeEntertainment = entertainment;
        totalPrice = price;
        typeCoupon = coupon;
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

    public String couponCode(){
        return typeCoupon;
    }
    String[] foodChoiceArray = {"Snacks", "Appetizers", "Sandwiches", "Light Dinner", "Three Course Dinner", "Jamie Oliver Caters"};
    int[] foodPriceArray ={5, 15, 20, 55, 125, 450};
    String[] drinkChoiceArray = {"Water", "PBR", "Champagne", "Full Bar", "Open Bar", "Top Shelf Open Bar"};
    int[] drinkPriceArray = {0, 5, 15, 25, 50, 250};
    String[] entertainmentChoiceArray = {"Cousin Vinny", "Bobo the Sad Clown", "DJ RC", "Live Band", "Weezer", "Adele"};
    int[] entertainmentPriceArray = {0, 250, 750, 2500, 125000, 850000};
    String[] couponCodeArray = {"50Off", "FREEDJ"};
    int[] couponDiscountArray = {50, 750};


    public int addCost() {
        for (int i = 0; i < foodChoiceArray.length; i++) {
            if (typeFood.equals(foodChoiceArray[i])) {
                totalPrice += ((foodPriceArray[i] * numGuests) + numGuests * 10);
            }
        }
        for (int i = 0; i < drinkChoiceArray.length; i++) {
            if (typeDrinks.equals(drinkChoiceArray[i])) {
                totalPrice += (drinkPriceArray[i] * numGuests);
            }
        }
        for (int i = 0; i < entertainmentChoiceArray.length; i++) {
            if (typeEntertainment.equals(entertainmentChoiceArray[i])) {
                totalPrice += (entertainmentPriceArray[i]);
            }
        }
//        for (int i=0; i<drinkChoiceArray.length; i++) {
//            if ((Arrays.asList(drinkChoiceArray).contains("Full Bar")) & (numGuests>=150)) {
//                totalPrice+=(drinkPriceArray[i]*numGuests);
//            } else if (typeDrinks.equals(drinkChoiceArray[i])) {
//                totalPrice+=(drinkPriceArray[i]*numGuests);
//            }
//        }

        String guestNumber = Integer.toString(numGuests);
        if (typeCoupon.equals(couponCodeArray[0])) {
            totalPrice -= 50;
        } else if (numGuests >= 150) {
            totalPrice -= 750;
        }
        return totalPrice;
    }

}










