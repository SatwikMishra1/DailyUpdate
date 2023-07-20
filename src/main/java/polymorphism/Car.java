package polymorphism;

public class Car {
    private String description;
    public void startEngine(){
        System.out.println("The engine of " + this.getClass().getSimpleName() + " has been started");
    }
    public void drive(){
        System.out.println("The car " + this.getClass().getSimpleName() + " is now in motion");
    }
    protected void runEngine(){
        System.out.println("The engine of " + this.getClass().getSimpleName() + " is now running");
    }
}
