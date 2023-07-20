package billsburger;

public class Drink extends Commodity{

    private int size;

    public Drink(String type, int size) {
        super(type,(size<100)?500:(size>500)?1000:750);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
