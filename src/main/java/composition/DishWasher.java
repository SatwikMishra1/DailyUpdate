package composition;

import lombok.Data;

@Data
public class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes(){
        System.out.println("Started doing dishes.....");
        System.out.println("dishwashing has been done");
    }
}
