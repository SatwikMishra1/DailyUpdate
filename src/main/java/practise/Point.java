package practise;

public class Point {
    // write your code here
    private int x;
    private int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public Point(){
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public double distance(){
        return Math.sqrt(this.x*this.x*1.0+this.y*this.y*1.0);
    }
    public double distance(int x,int y){
        return Math.sqrt((this.x-x)*(this.x-x)*1.0 + (this.y-y)*(this.y-y)*1.0);
    }
    public double distance(Point point){
        double px=point.getX();
        double py=point.getY();
        return Math.sqrt((this.x-px)*(this.x-px)*1.0 + (this.y-py)*(this.y-py)*1.0);
    }
}
