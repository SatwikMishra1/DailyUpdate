package polymorphism;

public class ElectricCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;

    public ElectricCar(double avgKmPerLitre, int batterySize) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }
}
