package practise;

public class Worker {
    protected String name;
    protected String birthDate;
    protected String endDate;

    public Worker(){

    }
    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
        return 0;
    }
    public void collectPay(){
        System.out.println(name + " come and collect your payment");
    }
    public void terminate(){
        System.out.println(name + " has now been terminated");
    }
}
