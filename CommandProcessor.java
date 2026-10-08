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
   System.out.println("look inventory help quit");
   return true;
  }
  // TODO: Students add commands HERE.
  return false;
 }
}
