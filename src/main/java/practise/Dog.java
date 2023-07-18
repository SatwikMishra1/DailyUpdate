package practise;

public class Dog extends Animal{
  public String earShape;
  public String tailShape;

    public Dog(String type, String size, double weight, String earShape, String tailShape) {
        super(type, size, weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }
    public Dog(String type, String size ,double weight) {
        this(type,size,weight,"Perky","Curled");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void moves(int speed){
        super.moves(speed);
        System.out.println("The dog " + this.type + " moves at the speed " + speed);
    }

}
