package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString(){
        String userInput;

        try {
            userInput = scanner.nextLine();
        } catch (IllegalArgumentException e ) {
            System.out.println("Error - Input must be valid");
            scanner.next();
            return getString();
        }
        return userInput;
    }

    public boolean yesOrNo(String prompt){
        String userContinues;
        System.out.println(prompt);
        try {
            userContinues = scanner.nextLine();
            if(!userContinues.toLowerCase().startsWith("y") && !userContinues.toLowerCase().startsWith("n")) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e){
            System.out.println("ERROR, input must be y/yes or n/no");
            return yesOrNo(prompt);
        }
        return userContinues.trim().equalsIgnoreCase("Y") || userContinues.trim().equalsIgnoreCase("Yes");
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        String userInputInt = scanner.nextLine();
        try{
            return Integer.valueOf(userInputInt);
        } catch(NumberFormatException e){
            System.out.println("ERROR, Input must be an Integer!");
            return getInt(prompt);
        }
    }

    public int getInt(String prompt, int min, int max){

        int userInput = getInt(prompt);


        try {
            if (userInput < min || userInput > max) {
                throw new IllegalArgumentException("no not it between " + min + " and " + max);
            }
            } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getInt(prompt, min, max);
            }
            return userInput;
        }


    public double getDouble(String prompt){

        System.out.println(prompt);
        String userInput;

        try {
            userInput = scanner.nextLine();
            return Double.valueOf(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR - Input must be an integer.");
            return getDouble(prompt);
        }
    }

    public double getDouble(double dmin, double dmax){
        double userInput;
        while (true) {
            userInput = getDouble("Between " + dmin + " and " + dmax + ",");
            if (userInput < dmin || userInput > dmax) {
                System.out.println("no not it");
            } else if (userInput >= dmin && userInput <= dmax) {
                System.out.println("sweet!");
                break;
            }
        }
        return userInput;
    }
}

