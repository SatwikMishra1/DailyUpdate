package nestedclasses;

import java.util.Comparator;

public class Employee {

    private int employeeId;

    private String name;
    private int yearsStarted;

    public Employee() {
    }

    public Employee(int employeeId, String name, int yearsStarted) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearsStarted = yearsStarted;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getYearsStarted() {
        return yearsStarted;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", yearsStarted=" + yearsStarted +
                '}';
    }
}
