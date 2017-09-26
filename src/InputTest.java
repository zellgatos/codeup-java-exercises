import util.Input;

public class InputTest {
    public static void main(String[] args){
        Input inputTest = new Input();
        String userInput;
        boolean userBoolean;
        int userInt;
        double userDouble;
        userInput = inputTest.getString();

        userBoolean = inputTest.yesOrNo();
        System.out.println(userBoolean);

        userInt = inputTest.getInt();
        System.out.println(userInt);

        userInt = inputTest.getInt(5, 80);
        System.out.println(userInt);

        userDouble = inputTest.getDouble();
        System.out.println(userDouble);

        userDouble = inputTest.getDouble(1, 100);
        System.out.println(userDouble);

        userInput = inputTest.getString();
        System.out.println(userInput);

    }
}
