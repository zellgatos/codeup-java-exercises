import sun.tools.java.ScannerInputReader;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(add(1, 2));
//        System.out.println(subtract(5, 3));
//        System.out.println(multiply(5, 5));
//        System.out.println(divide(10, 2));
//        System.out.println(modulus(8, 4));
//        getFactorial(getInteger(1, 10));
//        diceRoll(6);
    }

    public static int add(int x, int y){
        return x + y;
    }
    public static int subtract(int x, int y){
        return x - y;
    }
    public static int multiply(int x, int y){
        return x * y;
    }
    public static int divide(int x, int y){
        return x / y;
    }
    public static int modulus(int x, int y) {
        while (x > y) {
            x -= y;
        }
        return x;
    }

    public static void getInteger(int min, int max, Scanner Input) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number between " + min + " and " + max + ": ");
            int number = sc.nextInt();
            sc.nextLine();
            if (number <= max && number >= min) {
                System.out.println("The number you chose is " + number + ".");
                break;
            } else {
                System.out.println(number + " is not between " + min + " and " + max);

            }
        }
    }

    public static void getFactorial(int number) {
        Scanner sc = new Scanner(System.in);
        long factorial = 1;
        int userInput;
        String details = "";
        while (true) {
            System.out.println("Enter a number between 1 and 10:");
            userInput = sc.nextInt();
            for (int i = 1; i > number; i++) {
                details += (i ==1) ? i :  " x " + i;
                System.out.println(i +"! = " + i + " = " + (factorial *= i));
            }
            if (userInput >= 1 && userInput <= 10) {
                System.out.println("ok.");
            } else {
                System.out.println("Please give a number between 1 and 10");
                continue;
            }

            sc.nextLine();
            System.out.println("Would you like to try another number?(y/n)");

            String check = sc.nextLine();
            if (check.equalsIgnoreCase("y") || check.equalsIgnoreCase("yes")) {
                System.out.println("ok.");
            } else {
                break;
            }
        }
    }

    public static int randomNumber(int min, int max){
        return (int)Math.floor((Math.random() * ((max - min) + 1)));
    }

    public static void diceRoll(int sides) {


        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Diceo Rolleru!");
            String userInput = sc.nextLine();

            if(userInput.trim().equalsIgnoreCase("roll")){
                int dice1 = 1 + (int)(Math.random()) * ((sides - 1) +1);
                int dice2 = 1 + (int)(Math.random()) * ((sides - 1) +1);
                System.out.println("dices: " + dice1 + " " + dice2);

            } else {
                break;
            }
        }
    }

}


