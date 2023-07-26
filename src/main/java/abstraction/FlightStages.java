package abstraction;

public enum FlightStages implements TrackEnabled{

    GROUNDED,
    LAUNCH,
    CRUISE,
    DATA_COLLECTION;

    @Override
    public void takeOff() {
       if(this!=LAUNCH){
         System.out.println("taked off "+this);
       }
    }
    @Override
    public void track() {
     if(this!=GROUNDED){
         System.out.println("Monitoring "+this);
     }
    }
}
