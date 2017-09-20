import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }
        System.out.println("----------");

//        int start = 0;
//        do {
//            System.out.println(start += 2);
//        } while (start < 100);

//        int start = 105;
//        do {
//            System.out.println(start -= 5);
//        } while (start > -10);
//        System.out.println("----------");
//
//        long squared = 2;
//        do {
//
//            System.out.println(squared);
//            squared *= squared;
//
//        } while (squared < 1000000);
//        System.out.println("----------");

        for (int start = 100; start >= -10; start -= 5) {
            System.out.println(start);
        }
        System.out.println("----------");


        for (long j = 2; j <= 1000000; j *= j) {
            System.out.println(j);
        }
        System.out.println("----------");


        for (int k = 1; k <= 100; k++) {
            if ((k % 3) == 0 && (k % 5) == 0) {
                System.out.println("FizzBuzz");
                continue;
            } else if ((k % 5) == 0) {
                System.out.println("Buzz");
                continue;
            } else if ((k % 3) == 0) {
                System.out.println("Fizz");
                continue;
            }

            System.out.println(k);

        }
        System.out.println("----------");
        System.out.println("What number would you like to go up to?");
        int userNumberChoice = sc.nextInt();
        System.out.println("Here is your table!");
        System.out.println();
        System.out.println("number | squared | cubed \n------ | ------- | -----");
        String format = "%-7d|%-9d|%-9d%n";
        int l = 1;

        while (true) {
            while (l <= userNumberChoice) {
                System.out.format(format, l, l * l, l * l * l);
                l++;
            }
            sc.nextLine();
            System.out.println("Do you want to continue? (yes/no)");
            String yesOrNo = sc.nextLine();
            if (yesOrNo.equals("yes") || yesOrNo.equals("y")) {
                System.out.format(format, l, l * l, l * l * l);
                l++;
            } else {
                break;
            }
        }
        System.out.println("----------");

        while (true) {
            System.out.println("Enter a grade");
            int userGradeChoice = sc.nextInt();
            sc.nextLine();

            if (userGradeChoice <= 100 && userGradeChoice >= 88) {
                System.out.println("A");
            } else if (userGradeChoice <= 87 && userGradeChoice >= 80) {
                System.out.println("B");
            } else if (userGradeChoice <= 79 && userGradeChoice >= 67) {
                System.out.println("C");
            } else if (userGradeChoice <= 66 && userGradeChoice >= 60) {
                System.out.println("D");
            } else if (userGradeChoice <= 59) {
                System.out.println("F");
            }
            System.out.println("Do you want to continue? (yes/no)");
            String yesOrNo = sc.nextLine();
            if (yesOrNo.equals("yes") || yesOrNo.equals("y")) {
                System.out.println("ok");
            } else {
                break;
            }

        }
    }
}
