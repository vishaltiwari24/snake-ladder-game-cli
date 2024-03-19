package org.example.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import static org.example.Utils.Utils.rollDice;
import static org.example.constants.Constants.WINNING_POSITION;
import static org.example.constants.Constants.snakeAndLadderPositions;


public class gameRunTime {
    Map<String, Integer> allUsersPosition = new HashMap<>();

    public void initializePlayers(int noOfPlayers) {
        // Initialize players' positions
        for (int i = 1; i <= noOfPlayers; i++) {
            allUsersPosition.put("Player_" + i, 0);
        }
    }

    public void gamePlayLoop(int numberOfPlayers) {
        Scanner scanner = new Scanner(System.in);

        initializePlayers(numberOfPlayers);
        // Game loop
        while (true) {
            long startTime = System.currentTimeMillis();
            for (Map.Entry<String, Integer> entry : allUsersPosition.entrySet()) {
                //Initialize the game for player
                String playerName = entry.getKey();
                int currentPosition = entry.getValue();

                //Roll a dice to generate a RandomNumber between 1 to 6
                System.out.println(playerName + " press enter to roll a dice ");
                scanner.nextLine();
                int diceRoll = rollDice(new Random());
                // Update player's position
                int newPositionAfterDiceRoll = currentPosition + diceRoll;
                if (newPositionAfterDiceRoll <= WINNING_POSITION) {
                    allUsersPosition.put(playerName, newPositionAfterDiceRoll);
                    System.out.println(playerName + " rolled a " + diceRoll + " and moved to position " + newPositionAfterDiceRoll);
                }

                // Check for snakes and ladders
                if (snakeAndLadderPositions.containsKey(newPositionAfterDiceRoll)) {
                    int newPositionAfterSnakeOrLadder = snakeAndLadderPositions.get(newPositionAfterDiceRoll);
                    allUsersPosition.put(playerName, newPositionAfterSnakeOrLadder);
                    if (newPositionAfterSnakeOrLadder < newPositionAfterDiceRoll) {
                        System.out.println("(ㅠ﹏ㅠ) Sad bit by a snake! New Position: " + newPositionAfterSnakeOrLadder);
                    } else {
                        System.out.println("( ˶ˆᗜˆ˵ ) Rocking the Game! New Position: " + newPositionAfterSnakeOrLadder);
                    }

                    //Set the updated position to validate win in the further code block
                    newPositionAfterDiceRoll = newPositionAfterSnakeOrLadder;
                }

                // Check for winner
                if (newPositionAfterDiceRoll == WINNING_POSITION) {
                    System.out.println(playerName + " wins the game!");
                    scanner.close();
                    return;
                }
            }
            System.out.println("************************---------------------*******************************");
        }
    }


}
