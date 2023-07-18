package practise;

public class Circle {
    // write your code here
    protected double radius;
    public Circle(double radius){
        this.radius=radius;
        if(this.radius<0) this.radius=0;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}

class Cylinder1 extends Circle {
    private double height;
    public Cylinder1(double radius,double height){
        super(radius);
        this.height=height;
        if(this.height<0) this.height=0;
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return this.area*this.height;
    }
}
