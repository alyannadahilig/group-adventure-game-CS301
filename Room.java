import java.util.*;
/** Represents a location in the game world. */
public class Room {
 private String name;
 private String description;
 private Map<String,String> exits=new HashMap<>();
 private List<Item> items=new ArrayList<>();
 public Room(String n,String d){name=n;description=d;}
 public String getName(){return name;}
 public String getDescription(){return description;}
 public void addExit(String d,String r){exits.put(d,r);}
 public Map<String,String> getExits(){return exits;}
 public List<Item> getItems(){return items;}
}
