# CS301 Git Adventure

A text-based adventure game written in Java. Players can explore different rooms, collect items, and view their inventory.

## Team Members
- Jerome Baisa - Student A
- Alyanna Dahilig - Student B

## Features Added

### Student A - Jerome
- Created a gold system in `Player.java` with methods for checking and adding gold.
- Expanded the game world with three additional locations: Marketplace, Castle, and Garden, each with its own description and exits.
- Implemented a `score` command that lets players check their score and gold balance.
- Included the new command in the `help` menu.

### Student B - Alyanna
- Added Wild Berries in the Forest, Magic Lantern in the Tower, and Rare Pearl at the Lake.
- Added a reputation attribute to the player.
- Added a `map` command to display game locations.
- Added a `go` command to travel between connected rooms.
- Added a `take` command to collect items.
- Updated the welcome message and help command to include the new commands.

## How to Compile

Open the terminal in the project folder and run:

    javac *.java

## How to Run

After compiling, run:

    java Game

## Available Commands
- `look` - View the current room and its contents.
- `inventory` - View collected items.
- `score` - Display the player's current score and gold.
- `map` - Display the game map.
- `go <direction>` - Move between connected rooms.
- `take <item>` - Pick up an item.
- `help` - Display available commands.
- `quit` - Exit the game.

## Known Issues
- Players start with zero gold, and there is currently no way to collect more during gameplay.
- The three new rooms can be explored, but they don't have any additional activities or interactions yet.
- Wild Berries, Magic Lantern, and Rare Pearl can be collected, but their special effects are not implemented yet.
- The reputation attribute is not yet connected to gameplay actions.
- Some rooms may not be reachable until additional exits are added.

## Git Requirements
- Feature branches only
- PR review required
