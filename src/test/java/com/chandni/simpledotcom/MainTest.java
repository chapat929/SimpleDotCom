package com.chandni.simpledotcom;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";

        if (result.equals("Congrats, you hit my battleship")) {
            testResult = "passed";
        }

        System.out.println(testResult);

    }
}