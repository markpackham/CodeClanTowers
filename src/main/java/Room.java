import java.util.ArrayList;

public class Room {
    private int roomNo;
    private int capacity;
    private String type;
    private boolean hasProjector;
    private boolean hasBed;
    private ArrayList<Guest> guests;

    public Room(int roomNo, int capacity, String type, boolean hasProjector, boolean hasBed) {
        this.roomNo = roomNo;
        this.capacity = capacity;
        this.type = type;
        this.hasProjector = hasProjector;
        this.hasBed = hasBed;
        this.guests = new ArrayList<Guest>();
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasProjector() {
        return hasProjector;
    }

    public void setHasProjector(boolean hasProjector) {
        this.hasProjector = hasProjector;
    }

    public boolean isHasBed() {
        return hasBed;
    }

    public void setHasBed(boolean hasBed) {
        this.hasBed = hasBed;
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if(guestCount() < this.capacity){
            this.guests.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

}
