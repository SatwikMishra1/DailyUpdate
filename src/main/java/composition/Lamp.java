package composition;

public class Lamp {
    private String style;
    private int globRating;
    private boolean battery;
    public Lamp(String style,boolean battery,int globalRating){
        this.style=style;
        this.globRating=globalRating;
        this.battery=battery;
    }
    public void turnOn(){
        System.out.println("The lamp is turned ON");
    }
    public String getStyle(){
        return this.style;
    }
    public int getGlobRating(){
        return this.globRating;
    }
    public boolean isBattery(){
        return this.battery;
    }

}
