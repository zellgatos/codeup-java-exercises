import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
    theGame();
    }

    public static int randomNumber(int min, int max){
        return (int)Math.floor((Math.random() * ((max - min) + 1)));
    }

    public static void theGame(){
        Scanner sc = new Scanner(System.in);
        int random = randomNumber(1, 100);
        System.out.println("Lets play Guess That Number!");
        System.out.println("Press ENTER to begin.");
        sc.nextLine();
        System.out.println("guess a number between 1 - 100");
        System.out.println("Starto!!!");
        while (true) {
            int number = sc.nextInt();
            if (number > 100 || number < 1) {
                System.out.println("now now... between 1 - 100 plz!");
            } else if (number > random) {
                System.out.println("Lower!");
            } else if (number == random) {
                System.out.println("Stop Thats it!");
                break;
            } else if (number < random){
                System.out.println("Higher!");
            }
        }
    }

}
