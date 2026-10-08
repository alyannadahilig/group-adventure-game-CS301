/**
 * World builder. EVERY STUDENT MUST MODIFY THIS FILE.
 *
 * Student A: add 3 rooms.
 * Student B: add 3 items.
 * Student C: connect room network and add quest area.
 */
public class GameData {
 public static World createWorld(){
  World world=new World();

  // ===== CONFLICT ZONE =====
  Room village=new Room("Village","A peaceful village square.");
  Room forest=new Room("Forest","Tall trees surround you.");
  Room cave=new Room("Cave","A dark cave extends underground.");
  Room tower=new Room("Tower","An abandoned watch tower.");
  Room lake=new Room("Lake","A misty lake.");

  village.addExit("north","Forest");
  forest.addExit("south","Village");
  forest.addExit("east","Cave");

  village.getItems().add(new Item("Map","Shows local paths."));
  cave.getItems().add(new Item("Key","Opens a locked door."));

  world.addRoom(village);
  world.addRoom(forest);
  world.addRoom(cave);
  world.addRoom(tower);
  world.addRoom(lake);

  // TODO Student A room additions
  // TODO Student B item additions
  // TODO Student C quest location additions

  return world;
 }
}
