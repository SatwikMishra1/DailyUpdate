package demo.satwik;

import abstraction.*;
import abstraction.Dog;
import billsburger.Burger;
import billsburger.Drink;
import billsburger.Meal;
import billsburger.SideItem;
import composition.CoffeeMaker;
import composition.DishWasher;
import composition.Refrigerator;
import composition.SmartKitchen;
import demo.satwik.util.Helperutils;
import functionalinterface.Operator;
import list.ListPractise;
import model.Account;
import nestedclasses.Employee;
import nestedclasses.EmployeeComparator;
import polymorphism.*;

import java.util.*;

// java fx
// databases
//26 27

// java => 100 hours => 50 hours +50 hours (exercise) ==> 10 hours per day ==> 2 weeks(for java basics)




//MAVEN
// 1->5 and then maven repositories(12) => 3 hours => 1 day


//SPRING BOOT
// 1 week would be enough

//focus on streams
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      ArrayList<Employee> employees= new ArrayList<>(List.of(
              new Employee(10001,"ralph",2015),
              new Employee(10034,"david",2009),
              new Employee(10654,"harman",2019),
              new Employee(11324,"tarun",2022)
        ));
//        var employeeComparator=new EmployeeComparator<>();
//        employees.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }});
//        for(var employee: employees){
//            System.out.println(employee);
//        }
        List<String> list=new ArrayList<>(List.of("Ranjit","Tarun","Satwik","Sohail"));
        list.forEach((name) -> System.out.println("Hello "+name));
        list.forEach((name) -> {
            if(Objects.equals(name, "Ranjit")){
                System.out.println(name+" Chouhan");
            }else {
                System.out.println("Hello " + name);
            }
        });
        var answer=calculator(Helperutils::adSum,10,21);
    }

    private void doSomething(final Employee employee) {
        final Map<String, Employee> map = new HashMap<>();
        List<String> list = map.entrySet().parallelStream().map(this::getKey).toList();

    }

    private String getKey(final Map.Entry<String, Employee> map) {
        return map.getKey();
    }
    public static <T> T calculator(Operator<T> function,T value1, T value2){
        T result= function.operator(value1,value2);
        System.out.println("the answer is "+result);
        return result;
    }
}


///conflicts using cherrypick?
// merge over cherry pick
