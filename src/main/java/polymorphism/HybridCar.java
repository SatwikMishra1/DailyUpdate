package polymorphism;

public class HybridCar {
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar(double avgKmPerLitre, int cylinders, int batterySize) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }
}
