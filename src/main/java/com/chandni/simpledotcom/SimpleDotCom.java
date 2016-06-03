package com.chandni.simpledotcom;

public class SimpleDotCom {
    private int[] locations;
    private int numOfHits;
    private boolean isFloating;

    public SimpleDotCom() {
        isFloating = true;
    }

    public void setLocationCells(int[] locations) {
        this.locations = locations;
    }

    public String checkYourself(String userGuess) {
        String result = "You missed my battleship";
        int guess = Integer.parseInt(userGuess);

        for (int cell : locations) {
            if (guess == cell) {
                numOfHits++;
                result = "Congrats, you hit my battleship";
                break;
            }
        }

        if (!isFloating) {
            result = "You sunk my battleship! You've won! The battle is over!";
        }

        return result;
    }

    public boolean isFloating() {
        return numOfHits < locations.length;
    }
}
