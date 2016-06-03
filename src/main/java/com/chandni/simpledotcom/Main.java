package com.chandni.simpledotcom;

public class Main {
    public static void main(String[] args) {

        SimpleDotCom simpleDotCom = new SimpleDotCom();
        Player player = new Player();

        while (simpleDotCom.isFloating()) {
            String userGuess = player.getResponse("Where do you think the battleship is?");
            String result = simpleDotCom.checkYourself(userGuess);
            System.out.println(result);
        }
    }
}
