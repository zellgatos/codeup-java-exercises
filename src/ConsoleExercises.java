import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        String userInput;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println(number);
        //causes Exception in main thread

        System.out.println("please enter three words: ");
        String input1 = sc.next();
        String input2 = sc.next();
        String input3 = sc.next();

        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);
        /* entering less than three words wont let you complete
        the scan. entering more than three ignores all words
        after the third
         */
        sc.nextLine();
        System.out.println("Please create a full sentence: ");
        String sentence = sc.nextLine();

        System.out.println(sentence);
        //.next doesn't allow you to return a full sentance

        System.out.println("Enter length then width to find the area and perimeter: ");
        int length = sc.nextInt();
        int width = sc.nextInt();
        int area = length * width;
        int perimeter = 2 * length + 2 * width;
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
