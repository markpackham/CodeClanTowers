import java.util.ArrayList;

public class Booking {
    private int nightsBooked;
    private ArrayList<Bedroom> bedrooms;

    public Booking(int nightsBooked) {
        this.nightsBooked = nightsBooked;
        this.bedrooms = new ArrayList<Bedroom>();
    }

    public int getNightsBooked() {
        return nightsBooked;
    }

    public void setNightsBooked(int nightsBooked) {
        this.nightsBooked = nightsBooked;
    }


}
