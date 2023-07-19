package composition;

import lombok.Data;

@Data
public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        System.out.println("THe coffee has been brewed");
    }
}
