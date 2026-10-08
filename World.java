import java.util.*;
public class World {
 private Map<String,Room> rooms=new HashMap<>();
 public void addRoom(Room room){rooms.put(room.getName(),room);}
 public Room getRoom(String name){return rooms.get(name);}
}
