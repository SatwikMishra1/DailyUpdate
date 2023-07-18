package practise;

public record PersonRecord(String firstName, String lastName, int age) {
    public boolean isTeen(){
        if(this.age>12 && this.age<20) return true;
        else return false;
    }
}
