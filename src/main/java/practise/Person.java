package practise;

public class Person {
    // write your code here
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.firstName;
    }
    public int getAge(){
        return this.age;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        if(age>=0 && age<=100)
            this.age=age;
        else
            this.age=0;
    }
    public boolean isTeen(){
        if(this.age>12 && this.age<20) return true;
        else return false;
    }
    public String getFullName(){
        if(this.firstName.length()>0 && this.lastName.length()>0)
            return (this.firstName+this.lastName);
        else if(this.firstName.length()==0)
            return this.lastName;
        else if(this.lastName.length()==0)
            return this.firstName;
        else
            return "";
    }
}
