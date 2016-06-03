package com.chandni.simpledotcom;

public class Main {
    public static void main(String[] args) {

        SimpleDotCom simpleDotCom = new SimpleDotCom();
        Player player = new Player();
        int[] locations = {2, 3, 4};

        simpleDotCom.setLocationCells(locations);

        while (simpleDotCom.isFloating()) {
            String userGuess = player.getResponse("Where do you think the battleship is?");
            String result = simpleDotCom.checkYourself(userGuess);
            System.out.println(result);
        }
    }
}
