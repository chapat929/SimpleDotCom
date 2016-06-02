package com.chandni.simpledotcom;

public class SimpleDotCom {
    private int[] locations;
    private int numOfHits;

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

        if (numOfHits == locations.length) {
            result = "You sunk my battleship! You've won! The battle is over!";
        }


        return result;
    }
}
