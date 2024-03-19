package org.example.Utils;

import java.util.Random;

public class Utils {
    public static int rollDice(Random random) {
        return random.nextInt(6) + 1; // Random number between 1 and 6
    }

}
