package composition;

import lombok.Data;

@Data
public class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood(){
        System.out.println("THe food has been ordered");
    }
}
