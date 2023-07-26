package abstraction;

//lambda streams and collections
public abstract class Practise {
 protected String type;
 private String name;
 private double weight;

    public Practise(String type, String name, double weight) {
        this.type = type;
        this.name = name;
        this.weight = weight;
    }

    public abstract void move(Double speed);
    public abstract void makeNoise();


}
