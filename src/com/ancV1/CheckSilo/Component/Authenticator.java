package com.ancV1.CheckSilo.Component;

import com.ancV1.CheckSilo.Main;

public class Authenticator {
    private static final String PASSWORD = "123";
    private static final int MAX_ATTEMPTS = 3;
    private static int attempts = MAX_ATTEMPTS;
    private static final String PASSWORD_REQUEST_MESSAGE = "Please enter password(attempt left: %d): ";
    private static final String INCORRECT_PASSWORD_MESSAGE = "Incorrect password. Please try again.";
    static boolean auth(){
        while(attempts > 0){
            System.out.printf(PASSWORD_REQUEST_MESSAGE,attempts);
            String userInput = Main.SCANNER.nextLine();
            if(userInput.equals(PASSWORD)) {
                return true;
            } else {
                attempts--;
                System.out.println(INCORRECT_PASSWORD_MESSAGE);
            }
        }
        return false;
    }
}
