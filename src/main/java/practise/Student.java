package practise;

public class Student {
    private String name;
    private int age;
    public Student(){
    }
    public Student(String name, int age){
      this.name=name;
      this.age=age;
    }

    @Override
    public String toString() {
        return "age is " + this.age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimaryStudent extends Student{
    private String parentName;
    public PrimaryStudent(){
    }

    public PrimaryStudent(String name,int age,String parentName){
        super(name,age);
        this.parentName=parentName;
    }

    @Override
    public String toString() {
        return parentName+"'s child, " + super.toString();
    }
}
