package composition;

public class ComputerCase extends Product{

    private String powerSupply;
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    void pressPowerButton(){
        System.out.println("POWER TURNED ON.");
    }
}