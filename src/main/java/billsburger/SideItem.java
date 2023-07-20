package billsburger;

public class SideItem {
    private Commodity commodity;

    public SideItem(String type) {
        this.commodity = new Commodity(type,100);
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }
}
