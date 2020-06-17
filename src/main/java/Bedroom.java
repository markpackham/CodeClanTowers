import java.util.HashMap;

public class Bedroom {
    private int capacity;
    private String name;
    // type eg Single or Double room
    private String type;

    public Bedroom(int capacity, String name, String type) {
        this.capacity = capacity;
        this.name = name;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
