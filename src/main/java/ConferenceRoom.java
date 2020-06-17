import java.util.HashMap;

public class ConferenceRoom {

    private int capacity;
    private String name;
    private boolean hasProjector;

    public ConferenceRoom(int capacity, String name, boolean hasProjector) {
        this.capacity = capacity;
        this.name = name;
        this.hasProjector = hasProjector;
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
}
