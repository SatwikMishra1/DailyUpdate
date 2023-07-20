package billsburger;

public class Drink {
    private Commodity commodity;
    private int size;

    public Drink(String type, int size) {
        this.commodity=new Commodity();
        int price=(size<100)?500:(size>500)?1000:750;
        this.commodity = new Commodity(type,price);
        this.size = size;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
