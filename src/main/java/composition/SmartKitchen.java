package composition;

public class SmartKitchen {
  private CoffeeMaker brewMaster;
  private  DishWasher dishWasher;
  private Refrigerator icebox;

  public void addWater(){
      brewMaster.setHasWorkToDo(true);
      System.out.println("Water has been poured");
  }
    public void pourMilk(){
     icebox.setHasWorkToDo(true);
     System.out.println("Milk has been poured");
    }
    public void loadDishWasher(){
      dishWasher.setHasWorkToDo(true);
      System.out.println("DishWasher has been loaded");
    }

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator icebox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.icebox = icebox;
    }
}
