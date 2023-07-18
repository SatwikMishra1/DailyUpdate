package practise;

public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(){
    }
    public HourlyEmployee(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay(){
        System.out.println( name+" has his/her wages double from now");
    }

}
