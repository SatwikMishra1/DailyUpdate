package abstraction;

public abstract class Mammal extends Practise{
    public Mammal(String type, String name, double weight) {
        super(type, name, weight);
    }

    @Override
    public void move(Double speed) {
        System.out.println("This mamal "+type+" moves at the speed of "+speed);
    }

    public abstract void shedHair();
}
