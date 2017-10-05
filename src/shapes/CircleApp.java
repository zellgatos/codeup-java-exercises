package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args){
        Input input = new Input();
        boolean userBoolean;

        while(true) {
            Circle thisCircle = new Circle(input.getDouble("Enter the radius of the circle"));
            System.out.println("The area of the circle is:" + thisCircle.getArea() + "\nThe circumference is: " + thisCircle.getCircumference() + ".");
            userBoolean = input.yesOrNo("Would you like to make another circle?");
            if (!userBoolean) {
                System.out.println("ok");
            } else { Circle.displayNumOfCircles();
                break;
            }
        }
    }
}
