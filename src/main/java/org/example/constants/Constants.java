package org.example.constants;

import java.util.HashMap;

public class Constants {
    public static final int WINNING_POSITION = 100;
    public static final HashMap<Integer, Integer> snakeAndLadderPositions = new HashMap<>();

    static {
        snakeAndLadderPositions.put(1, 38);
        snakeAndLadderPositions.put(4, 14);
        snakeAndLadderPositions.put(9, 31);
        snakeAndLadderPositions.put(16, 6);
        snakeAndLadderPositions.put(21, 42);
        snakeAndLadderPositions.put(28, 84);
        snakeAndLadderPositions.put(36, 44);
        snakeAndLadderPositions.put(47, 26);
        snakeAndLadderPositions.put(49, 11);
        snakeAndLadderPositions.put(51, 67);
        snakeAndLadderPositions.put(56, 53);
        snakeAndLadderPositions.put(62, 19);
        snakeAndLadderPositions.put(64, 60);
        snakeAndLadderPositions.put(71, 91);
        snakeAndLadderPositions.put(80, 100);
        snakeAndLadderPositions.put(87, 24);
        snakeAndLadderPositions.put(93, 73);
        snakeAndLadderPositions.put(95, 75);
        snakeAndLadderPositions.put(98, 78);

    }
}
