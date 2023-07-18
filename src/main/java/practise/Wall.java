package practise;

public class Wall {
    // write your code here
    private double width;
    private double height;

    public Wall(){

    }
    public Wall(double width, double height){
        if(width>0)
            this.width=width;
        else this.width=0.0;
        if(height>0)
            this.height=height;
        else this.height=0.0;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        //if(this.width>0)
        this.width=width;
        if(this.width<0) this.width=0;
        //else this.width=0;
    }

    public void setHeight(double height){
        //if(this.height>0)
        this.height=height;
        if(this.height<0) this.height=0;
        //else this.height=0;
    }

    public double getArea(){
        return this.width*this.height;
    }
}