package polymorphism;

public class Scary extends Movie{
    public Scary(String title) {
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),"Scary scenes","Scary castle","Ouija board");
    }
}
