package billsburger;

import java.util.Objects;

public class Burger extends Commodity {
    private boolean onionTopping;
    private boolean tomatoTopping;
    private boolean capsicumTopping;

    private boolean isDelux;

    public void addExtraTopping(String toppingType) {
        if (isDelux) return;
        else {
            int extraCharge = (Objects.equals(toppingType, "onion")) ? 30 : (Objects.equals(toppingType, "tomato")) ? 20 : 10;
            this.setPrice(extraCharge + this.getPrice());
        }
        System.out.println("extra " + toppingType + " added");
    }

    public Burger() {
        super("capsicum burger", 80);
        this.onionTopping = false;
        this.tomatoTopping = false;
        this.capsicumTopping = true;
        this.isDelux = false;
    }

    public Burger(String type, boolean onionTopping, boolean tomatoTopping, boolean capsicumTopping) {
        super(type, (onionTopping) ? 100 : (tomatoTopping) ? 90 : 80);
        this.onionTopping = onionTopping;
        this.tomatoTopping = tomatoTopping;
        this.capsicumTopping = capsicumTopping;
    }

    public Burger(String type, boolean onionTopping, boolean tomatoTopping, boolean capsicumTopping, boolean isDelux) {
        if (isDelux) {
            this.setType(type);
            this.onionTopping = onionTopping;
            this.tomatoTopping = tomatoTopping;
            this.capsicumTopping = capsicumTopping;
            int baseCharge = 200;
            this.setPrice(baseCharge);
        } else {
            this.setType(type);
            this.onionTopping = onionTopping;
            this.tomatoTopping = tomatoTopping;
            this.capsicumTopping = capsicumTopping;
            int baseCharge = (this.onionTopping) ? 100 : (this.tomatoTopping) ? 90 : 80;
            this.setPrice(baseCharge);
        }
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
