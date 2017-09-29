package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        Quadrilateral box2 = new Square(5);

        System.out.println(box1.getArea() + "\n" + box1.getPerimeter());
        System.out.println(box2.getArea() + "\n" + box2.getPerimeter());
        showQuadrilateralInfo(box1);

        Measurable myShape = new Rectangle(9, 10);
        showQuadrilateralInfo(myShape);
    }
    public static void showQuadrilateralInfo(Measurable rectangle){
        System.out.println("The area is "+rectangle.getArea()+", and the perimeter is "+rectangle.getPerimeter()+".");
    }
}
