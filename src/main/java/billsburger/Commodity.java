package billsburger;

public class Commodity {
    private String type;
    private int price;

    public Commodity(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public Commodity(){

    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
