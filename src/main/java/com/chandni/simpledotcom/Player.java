package com.chandni.simpledotcom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {

    public String getResponse(String prompt) {
        String response = null;

        System.out.println(prompt);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            response = bufferedReader.readLine();

            if (response.length() == 0) {
                return null;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;

    }
}
