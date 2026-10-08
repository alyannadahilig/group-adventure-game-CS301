import java.util.*;
/**
 * Shared player class. EVERY STUDENT MUST MODIFY THIS FILE.
 *
 * Student A TODO: Add gold system.
 * Student B TODO: Add reputation system.
 * Student C TODO: Add quest tracking.
 *
 * This file is an intentional merge-conflict zone.
 */
public class Player {
  private Room currentRoom;
  private List<Item> inventory;
  private int score;

  // ===== CONFLICT ZONE =====
  // Add your new fields directly below this line.

  public Player(Room room){
    currentRoom=room;
    inventory=new ArrayList<>();
  }

  public Room getCurrentRoom(){ return currentRoom; }
  public void enterRoom(Room room){ currentRoom=room; }
  public List<Item> getInventory(){ return inventory; }
  public void addItem(Item item){ inventory.add(item); }
  public int getScore(){ return score; }
  public void addScore(int points){ score+=points; }
}
