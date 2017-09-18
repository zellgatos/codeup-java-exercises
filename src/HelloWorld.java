public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world!");
        int myFavoriteNumber = 4;
        System.out.println(myFavoriteNumber);
        String myString = "3.14159";
        System.out.println(myString);
        //char gives error with double quotes
        //value of a char cannot be used in a string
        //double cannont be changed to a string value
        float myNumber = 3.14F;
        System.out.println(myNumber);
        //error illegal start of expressions
        //incompatible types error double to long
        //incompatible types error double to float
        /*Fixed by assigning F at the end of the intiger
        or by assigning the variable type to double */
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        /* Thefirst reads 5, 6 then it reads 6, 6, because plus signs in
        front of the variable will do the operation but display the same
        value. adding plus signs does the operation and dispalys the value
        after
         */
//        class y = 1;
//        System.out.println(y);
        //java expects a whole new class rather than class being a type of
        //variable
        int x = 4;
        x =+ 5;
        System.out.println(x);

        int y = 4;
        y *= x;
        System.out.println(y);

        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

    }
}
