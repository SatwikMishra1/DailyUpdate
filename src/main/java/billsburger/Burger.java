package billsburger;

import java.util.Objects;

public class Burger {
    private Commodity commodity;
    private boolean onionTopping;
    private boolean tomatoTopping;
    private boolean capsicumTopping;

    private boolean isDelux;

    public void addExtraTopping(String toppingType){
        if(isDelux) return;
        else {
            int extraCharge = (Objects.equals(toppingType, "onion")) ? 30 : (Objects.equals(toppingType, "tomato")) ? 20 : 10;
            this.commodity.setPrice(extraCharge + this.commodity.getPrice());
        }
        System.out.println("extra "+toppingType+" added");
    }

    public Burger() {
     this.commodity.setType("Capsicum Burger");
     this.commodity.setPrice(80);
     this.onionTopping = false;
     this.tomatoTopping = false;
     this.capsicumTopping = true;
     this.isDelux=false;
    }

    public Burger(String type, boolean onionTopping, boolean tomatoTopping, boolean capsicumTopping) {
        this.commodity=new Commodity();
        this.commodity.setType(type);
        this.onionTopping = onionTopping;
        this.tomatoTopping = tomatoTopping;
        this.capsicumTopping = capsicumTopping;
        int baseCharge = (this.onionTopping) ? 100 : (this.tomatoTopping) ? 90 : 80;
        this.commodity.setPrice(baseCharge);
    }

    public Burger(String type, boolean onionTopping, boolean tomatoTopping, boolean capsicumTopping, boolean isDelux) {
        this.commodity=new Commodity();
        if (isDelux) {
             this.commodity.setType(type);
             this.onionTopping = onionTopping;
             this.tomatoTopping = tomatoTopping;
             this.capsicumTopping = capsicumTopping;
             int baseCharge = 200;
             this.commodity.setPrice(baseCharge);
         } else {
             this.commodity.setType(type);
             this.onionTopping = onionTopping;
             this.tomatoTopping = tomatoTopping;
             this.capsicumTopping = capsicumTopping;
             int baseCharge = (this.onionTopping) ? 100 : (this.tomatoTopping) ? 90 : 80;
             this.commodity.setPrice(baseCharge);
         }
     }
    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public boolean isOnionTopping() {
        return onionTopping;
    }

    public void setOnionTopping(boolean onionTopping) {
        this.onionTopping = onionTopping;
    }

    public boolean isTomatoTopping() {
        return tomatoTopping;
    }

    public void setTomatoTopping(boolean tomatoTopping) {
        this.tomatoTopping = tomatoTopping;
    }

    public boolean isCapsicumTopping() {
        return capsicumTopping;
    }

    public void setCapsicumTopping(boolean capsicumTopping) {
        this.capsicumTopping = capsicumTopping;
    }
}
