package shapes;



public class Circle {
    private double radius;
    private static int numberOfCircles;

    public Circle(double rad){
        radius = rad;
        numberOfCircles++;
    }

    public double getArea(){
        double area = this.radius * this.radius * Math.PI;
        return area;
    }

    public double getCircumference(){
        double circumference = 2 * this.radius * Math.PI;
        return circumference;
    }

    public static void displayNumOfCircles(){
        String plural = " circle.";
        if(numberOfCircles>1){plural = " circles.";}
        System.out.println("You made "+numberOfCircles+ plural);
    }
}
