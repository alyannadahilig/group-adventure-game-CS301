/**
 * Shared command file.
 * Student A: add score command.
 * Student B: add map command.
 * Student C: add quest command.
 */
public class CommandProcessor {
 public static boolean process(String command,Player player,World world){
  if(command.equalsIgnoreCase("look")){
   Room r=player.getCurrentRoom();
   System.out.println("Location: "+r.getName());
   System.out.println(r.getDescription());
   System.out.println("Items: "+r.getItems());
   System.out.println("Exits: "+r.getExits().keySet());
   return true;
  }
  if(command.equalsIgnoreCase("inventory")){
   System.out.println(player.getInventory());
   return true;
  }
  if(command.equalsIgnoreCase("help")){
   System.out.println("look inventory score map go take help quit");
   return true;
  }
  // TODO: Students add commands HERE.
  
    // Jerome: Display player's score and gold amount
    if(command.equalsIgnoreCase("score")){
        System.out.println("Score: " + player.getScore());
        System.out.println("Gold: " + player.getGold());
        return true;
   }

    // Aly: Display the map of the game world
    if(command.equalsIgnoreCase("map")){
        System.out.println("~~~ WORLD MAP ~~~");
        System.out.println("Village - North: Forest, East: Castle, West: Marketplace");
        System.out.println("Forest - South: Village, East: Cave");
        System.out.println("Cave - Look for nearby exits");
        System.out.println("Castle - West: Village, North: Garden");
        System.out.println("Garden - South: Castle");
        System.out.println("Marketplace - East: Village");
        System.out.println("Tower - Look for nearby exits");
        System.out.println("Lake - Look for nearby exits");
        return true;
    }

    // Aly: Move the player to another room
    if(command.startsWith("go ")){
        String direction = command.substring(3).trim().toLowerCase();
        String nextRoom = player.getCurrentRoom().getExits().get(direction);

        if(nextRoom == null){
            System.out.println("You cannot go that way.");
        } else {
            player.enterRoom(world.getRoom(nextRoom));
            System.out.println("You entered the " + nextRoom + ".");
        }
        return true;
    }

    // Aly: Allow the player to pick up items
    if(command.toLowerCase().startsWith("take ")){
        String itemName = command.substring(5).trim();

        // Check the items in the current room
        for(Item item : player.getCurrentRoom().getItems()){
            if(item.getName().equalsIgnoreCase(itemName)){
                player.addItem(item);
                player.getCurrentRoom().getItems().remove(item);
                System.out.println("YAY! You picked up the " + item.getName() + "!");
                return true;
            }
        }

        System.out.println("That item is not in this room.");
        return true;
    }

  return false;
 }
}
