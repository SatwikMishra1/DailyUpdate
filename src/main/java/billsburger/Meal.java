package billsburger;

import java.util.Objects;

public class Meal {
    public class Burger extends Commodity {
        private boolean onionTopping;
        private boolean tomatoTopping;
        private boolean capsicumTopping;

        private boolean isDelux;

        public void addExtraTopping(String toppingType) {
            if (isDelux) return;
            else {
                int extraCharge = (Objects.equals(toppingType, "onion")) ? 30 : (Objects.equals(toppingType, "tomato")) ? 20 : 10;
                this.setPrice(extraCharge + this.getPrice());
            }
            System.out.println("extra " + toppingType + " added");
        }

        public Burger() {
            super("capsicum burger", 80);
            this.onionTopping = false;
            this.tomatoTopping = false;
            this.capsicumTopping = true;
            this.isDelux = false;
        }

        public Burger(String type, boolean onionTopping, boolean tomatoTopping, boolean capsicumTopping) {
            super(type, (onionTopping) ? 100 : (tomatoTopping) ? 90 : 80);
            this.onionTopping = onionTopping;
            this.tomatoTopping = tomatoTopping;
            this.capsicumTopping = capsicumTopping;
        }

        public Burger(String type, boolean onionTopping, boolean tomatoTopping, boolean capsicumTopping, boolean isDelux) {
            if (isDelux) {
                this.setType(type);
                this.onionTopping = onionTopping;
                this.tomatoTopping = tomatoTopping;
                this.capsicumTopping = capsicumTopping;
                int baseCharge = 200;
                this.setPrice(baseCharge);
            } else {
                this.setType(type);
                this.onionTopping = onionTopping;
                this.tomatoTopping = tomatoTopping;
                this.capsicumTopping = capsicumTopping;
                int baseCharge = (this.onionTopping) ? 100 : (this.tomatoTopping) ? 90 : 80;
                this.setPrice(baseCharge);
            }
        }

        public boolean isOnionTopping() {
            return onionTopping;
        }

        public void setOnionTopping(boolean onionTopping) {
            this.onionTopping = onionTopping;
        }

        public boolean isTomatoTopping() {
            return tomatoTopping;
        }

        public void setTomatoTopping(boolean tomatoTopping) {
            this.tomatoTopping = tomatoTopping;
        }

        public boolean isCapsicumTopping() {
            return capsicumTopping;
        }

        public void setCapsicumTopping(boolean capsicumTopping) {
            this.capsicumTopping = capsicumTopping;
        }
    }
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    private int[] array;

    private boolean isDeluxBurgerMeal;

    public void printBill(){
        int total=burger.getPrice()+drink.getPrice()+sideItem.getCommodity().getPrice();
        System.out.println("Your total bill is "+total);
        System.out.println("Burger ------> "+burger.getPrice());
        System.out.println("Drink ------> "+ drink.getPrice());
        System.out.println("Side Item ------> "+sideItem.getCommodity().getPrice());
    }

    public Meal(Burger burger, Drink drink, SideItem sideItem, boolean isDeluxBurgerMeal) {
        this.burger = isDeluxBurgerMeal?new Burger("hamburger",true,false,false,true):burger;
        this.drink = drink;
        this.sideItem = sideItem;
        this.isDeluxBurgerMeal=isDeluxBurgerMeal;
    }


    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }

    public void setSideItem(SideItem sideItem) {
        this.sideItem = sideItem;
    }
}
