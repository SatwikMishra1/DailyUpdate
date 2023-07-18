package practise;

public class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(){
     System.out.println("this is a constructor");
    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }



    public void moves(int speed){
        System.out.println(type + " moves at the speed " + speed);
    }
    public void makesNoise(){
        System.out.println(type + " makes some kind of noise");
    }
}
