import java.util.HashMap;
import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private String name;
    private boolean hasProjector;
    private ArrayList<Guest> guests;

    public ConferenceRoom(int capacity, String name, boolean hasProjector) {
        this.capacity = capacity;
        this.name = name;
        this.hasProjector = hasProjector;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasProjector() {
        return hasProjector;
    }

    public void setHasProjector(boolean hasProjector) {
        this.hasProjector = hasProjector;
    }

    public void addGuest(Guest guest) {
        if (guestCount() < this.capacity) {
            this.guests.add(guest);
        }
    }

    public int guestCount() {
        return this.guests.size();
    }
}
