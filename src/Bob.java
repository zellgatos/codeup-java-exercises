import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        System.out.println("Hi i'm Bob");
        while (true){
            Scanner tell = new Scanner(System.in);
            String talkToBob = tell.nextLine();

            if (talkToBob.endsWith("!")){
                System.out.println("Whoa, chill out!");
            } else if (talkToBob.endsWith("?")){
                System.out.println("Sure fam.");
            } else if (talkToBob.equals("")){
                System.out.println("Fine. Be that way!");
            } else if(talkToBob.equalsIgnoreCase("bye")) {
                System.out.println("laterz breh");
                break;
            } else {
                System.out.println("Whatever...");
            }

        }
    }
}
