package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class RoomService {

    // 1. Declare a Collection to store Room Inventory

    private Collection<Room> rooms;

    public RoomService() {
        this.rooms = new ArrayList<>();

        // 2. Initialize Collection and assign it to the Room Inventory

    }

    public Collection<Room> getInventory(){

        // 3. Return the Room Inventory

        return new ArrayList<>(this.rooms);
    }

    public void createRoom(String name, String type, int capacity, double rate) {
        Room newroom = new Room(name, type, capacity, rate);
        this.rooms.add(newroom);
        // 4. Add a new Room to the Room Inventory using the provided parameters


    }

    public void createRooms(Room[] rooms) {
        this.rooms.addAll(Arrays.asList(rooms));
        }

        // 5. Add the Rooms provided in the Array to the Room Inventory

    public void removeRoom(Room room) {
        this.rooms.remove(room);

        // 6. Remove the provided Room from the Room Inventory

    }
}
