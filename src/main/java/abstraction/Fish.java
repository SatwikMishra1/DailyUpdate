package abstraction;

public class Fish extends Practise{
    public Fish(String type, String name, double weight) {
        super(type, name, weight);
    }
    public void move(Double speed){
        System.out.println("Fish moves at the speed of"+speed);
    }

    public void makeNoise(){
        System.out.println("splash splash !!!!!");
    }
}
