# Snake and Ladder CLI Game

Welcome to the Snake and Ladder CLI game!
This is a simple command-line implementation of the classic Snake and Ladder game,
where players roll a dice and moves across the board, encountering snakes and ladders along the way.
Player to who reaches 100 first wins the game
## Constraints
Minimum number of players: 2
Maximum number of players: 10
Everyone starts at 0

## Steps to start the game
Download the jar file
- [JarFileDownloadLink](https://github.com/vishaltiwari24/snake-ladder-game-cli/blob/25ac1d4809324d6e00f4091839551d4ddd18ecf7/Game/SnakeLadderGameCli-1.0-SNAPSHOT.jar)

open command-prompt or terminal on the Download location
run the following command

```java -jar SnakeLadderGameCli-1.0-SNAPSHOT.jar```

Alternate for windows
Copy the startGame.bat file in the Download location
Double-click on the startGame.bat file

- [DownloadGameFolder](https://github.com/vishaltiwari24/snake-ladder-game-cli/tree/25ac1d4809324d6e00f4091839551d4ddd18ecf7/Game)

## Edge Cases of the game
Currently, the game is set with the static snake & ladder position
If the  posiiton of snake & ladder of postion (1 to 6) is set to send the user back to (1,6) it will continue a infinite loop of no one winning.
## Further Enhancement
1. Recieve snake & ladder position via input file
2. Create a cheat-code pattern which allows user to win in minimum number of steps by calculating the shortest path to win and generate the sequence of steps for the user
## Authors

- [@vishaltiwari24](https://github.com/vishaltiwari24)

