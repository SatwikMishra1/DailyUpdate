package billsburger;

public class Meal {
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
