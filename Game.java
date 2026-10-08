/**
 * Entry point for Git Adventure.
 * Students should NOT make major changes here.
 */
import java.util.*;
public class Game {
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    World world=GameData.createWorld();
    Player player=new Player(world.getRoom("Village"));
    System.out.println("Welcome to Git Adventure");
    System.out.println("Commands: look, inventory, help, quit");
    while(true){
      System.out.print("> ");
      String cmd=scanner.nextLine();
      if(cmd.equalsIgnoreCase("quit")) break;
      if(!CommandProcessor.process(cmd,player,world)){
        System.out.println("Unknown command.");
      }
    }
  }
}
