package org.example;


import org.example.implementation.gameRunTime;

import java.util.Scanner;

import static org.example.Utils.BannerUtils.displayExitBanner;
import static org.example.Utils.BannerUtils.displayStartUpBanner;

public class App {
    public static void main(String[] args) {

        displayStartUpBanner();
        gameRunTime gameplay = new gameRunTime();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of player (Maximum player: 10 Minimum Player:2)");
        int numberOfPlayers = scanner.nextInt();
        if (numberOfPlayers < 2 || numberOfPlayers > 10) {
            System.out.println("Invalid Number of player (Maximum player: 10 Minimum Player:2)");
            System.out.println("Exiting Game");
        } else {
            gameplay.gamePlayLoop(numberOfPlayers);
        }
        displayExitBanner();
    }
}
