package polymorphism;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }
    public void watchMovie(){
        String instanceType= this.getClass().getSimpleName();
        System.out.println(title + "is a " + instanceType +" film");
    }
    public Movie getMovie(String title, String type){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'S' -> new Scary(title);
            default -> new Movie(title);
        };
    }
}
