package models;

import java.util.Arrays;

/**
 * Created by Guest on 8/4/7.
 */
public class Event {
    // private values
    private int numGuests;
    private String typeFood;
    private String typeDrinks;
    private String typeEntertainment;
    private int totalPrice;
    private int createCouponDiscount;
    private int foodCost;
    private int guestCost;
    private int drinkCost;
    private int entertainmentCost;

    public Event(int guests, String food, String drinks, String entertainment) {
        numGuests = guests;
        typeFood = food;
        typeDrinks = drinks;
        typeEntertainment = entertainment;
    }
    // Getter methods
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

    // Arrays of choices for food/drink/entertainment/coupon
    private String[] foodChoiceArray = {"Snacks", "Appetizers", "Sandwiches", "Light Dinner", "Three Course Dinner", "Jamie Oliver Caters"};
    private int[] foodPriceArray ={5, 15, 20, 55, 125, 450};
    private String[] drinkChoiceArray = {"Water", "PBR", "Champagne", "Full Bar", "Open Bar", "Top Shelf Open Bar"};
    private int[] drinkPriceArray = {0, 5, 15, 25, 50, 250};
    private String[] entertainmentChoiceArray = {"Cousin Vinny", "Bobo the Sad Clown", "DJ RC", "Live Band", "Weezer", "Adele"};
    private int[] entertainmentPriceArray = {0, 250, 750, 2500, 125000, 850000};
    private String[] couponCodeArray = {"50Off", "FREEDJ"};
    private int[] couponDiscountArray = {50, 750};

    // Cost Calculations
        public int addCost() {
            totalPrice = (numGuests*10)+createFoodCost()+createDrinkCost()+createEntertainmentCost();
            return totalPrice;
        }

        public int createCouponDiscount(String coupon) {
            for (String couponCode : couponCodeArray) {
                if (coupon.equalsIgnoreCase(couponCode)) {
                    createCouponDiscount = totalPrice - 50;
                } else if (coupon.equalsIgnoreCase(couponCode)) {
                    createCouponDiscount = totalPrice - 50;
                }
            }
            return createCouponDiscount;
        }

        public int createGuestCost() {
            guestCost = numGuests * 10;
            return guestCost;
        }

        public int createFoodCost(){
            for (int i = 0; i < foodChoiceArray.length; i++) {
                if (typeFood.equalsIgnoreCase(foodChoiceArray[i])) {
                    foodCost = foodPriceArray[i] * numGuests;
                }
            }
            return foodCost;
        }

        public int createDrinkCost() {
            for (int i = 0; i < drinkChoiceArray.length; i++) {
                if (typeDrinks.equalsIgnoreCase(drinkChoiceArray[i])) {
                    drinkCost = drinkPriceArray[i] * numGuests;
                }
            }
            return drinkCost;
        }

        public int createEntertainmentCost() {
            for (int i = 0; i < entertainmentChoiceArray.length; i++) {
                if (typeEntertainment.equalsIgnoreCase(entertainmentChoiceArray[i])) {
                    entertainmentCost = entertainmentPriceArray[i];
                }
            }
            return entertainmentCost;
        }



}










