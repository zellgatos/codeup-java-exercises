import util.Input;

public class InputTest {
    public static void main(String[] args){
        Input inputTest = new Input();
        String userInput;
        boolean userBoolean;
        int userInt;
        double userDouble;
        userInput = inputTest.getString();
        System.out.println("say something:");

        userBoolean = inputTest.yesOrNo("continue? y/n");
        System.out.println(userBoolean);

        userInt = inputTest.getInt("enter an integer:");
        System.out.println(userInt);

        userInt = inputTest.getInt("enter an integer:", 5, 80);
        System.out.println(userInt);

        userDouble = inputTest.getDouble("enter a double:");
        System.out.println(userDouble);

        userDouble = inputTest.getDouble(1, 100);
        System.out.println(userDouble);

        userInput = inputTest.getString();
        System.out.println(userInput);

    }
}
