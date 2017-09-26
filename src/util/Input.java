package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString(){
        String userInputString = scanner.nextLine();
        return userInputString;
    }

    public boolean yesOrNo(){
        String yesNo = this.scanner.nextLine();
         return yesNo.equalsIgnoreCase("yes") || yesNo.equalsIgnoreCase("y");
    }

    public int getInt(){
        int userInputInt = scanner.nextInt();
        return userInputInt;
    }

    public int getInt(int min, int max){
        int userInput;
        while (true) {
            System.out.println("Between " + min + " and " + max + ",");
            userInput = getInt();
            if (userInput < min || userInput > max) {
                System.out.println("no not it");
            } else if (userInput >= min && userInput <= max) {
                System.out.println("sweet!");
                break;
            }
        }
        return userInput;
    }

    public double getDouble(){
        double userInput = scanner.nextDouble();
        return userInput;
    }

    public double getDouble(double dmin, double dmax){
        double userInput;
        while (true) {
            System.out.println("Between " + dmin + " and " + dmax + ",");
            userInput = getDouble();
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

