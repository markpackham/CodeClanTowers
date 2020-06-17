import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Room> rooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.rooms = new ArrayList<Room>();
        this.diningRooms = new HashMap<String, DiningRoom>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int roomCount() {
        return this.rooms.size();
    }

    public void checkInGuest(Room room, Guest guest) {
        room.addGuest(guest);
    }

    public void checkOutGuest(Room room, Guest guest) {
            if(this.rooms.contains(room)){
                room.removeGuest(guest);
            }
    }

    public void addDinningRoom(String name, DiningRoom diningRoom) {
        this.diningRooms.put(name,diningRoom);
    }

    public int diningRoomCount() {
        return this.diningRooms.size();
    }
}