package abstraction;

public class Dog extends Mammal implements FlightEnabled,TrackEnabled{
    public Dog(String type, String name, double weight) {
        super(type, name, weight);
    }



    public void shedHair(){
        System.out.println("Dogs shed hair all the time");
    }

    public void makeNoise(){
        System.out.println("woooooouuuuuuu");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void track() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
