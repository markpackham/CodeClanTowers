import java.util.ArrayList;

public class Bedroom {
    private int capacity;
    private int nightlyRate;
    private String name;
    // type eg Single or Double room
    private String type;
    private ArrayList<Guest> guests;

    public Bedroom(int capacity, int nightlyRate, String name, String type) {
        this.capacity = capacity;
        this.nightlyRate = nightlyRate;
        this.name = name;
        this.type = type;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(int nightlyRate) {
        this.nightlyRate = nightlyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addGuest(Guest guest) {
        if(guestCount() < this.capacity){
            this.guests.add(guest);
        }
    }

    public int guestCount() {
        return this.guests.size();
    }
}
