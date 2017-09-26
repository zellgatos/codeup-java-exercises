package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args){
        Input input = new Input();
        boolean userBoolean;

        while(true) {
            System.out.println("Enter the radius of the circle");
            Circle thisCircle = new Circle(input.getDouble());
            System.out.println("The area of the circle is:" + thisCircle.getArea() + "\nThe circumference is: " + thisCircle.getCircumference() + ".");
            System.out.println("Would you like to make another circle?");
            userBoolean = input.yesOrNo();
            if (!userBoolean) {
                System.out.println("ok");
            } else { Circle.displayNumOfCircles();
                break;
            }
        }
    }
}
