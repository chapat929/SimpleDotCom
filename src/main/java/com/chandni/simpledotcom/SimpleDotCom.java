package com.chandni.simpledotcom;

import java.util.ArrayList;
import java.util.List;

public class SimpleDotCom {
    private int numOfHits;
    private boolean isFloating;
    private List<Integer> locations;

    public SimpleDotCom() {
        isFloating = true;
        setLocationCells();
    }

    public void setLocationCells() {
        locations = new ArrayList<Integer>();
        locations.add(2);
        locations.add(3);
        locations.add(4);
    }

    public String checkYourself(String userGuess) {
        String result = "You missed my battleship";
        int guess;

        try {
            guess = Integer.parseInt(userGuess);
        } catch (NumberFormatException e) {
            guess = -1;
            System.out.println("Sorry that's not a valid number");
        }

        for (int cell : locations) {
            if (cell == guess) {
                locations.remove(locations.indexOf(cell));
                result = "Congrats, you hit my battleship";
                break;
            }
        }

        if (locations.size() == 0) result = "You sunk my battleship! You've won! The battle is over!";

        return result;
    }

    public boolean isFloating() {
        return locations.size() != 0;
    }
}
