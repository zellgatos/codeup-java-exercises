package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle (5, 4);
        Rectangle box2 = new Square (5);

        System.out.println("Rectangle \n"+"Area: "+box1.getArea()+"\n"+"Perimeter: "+box1.getPerimeter());
        System.out.println(" ");
        System.out.println("Square \n"+"Area: "+box2.getArea()+"\n"+"Perimeter: "+box2.getPerimeter());
    }
}
