package shapes;

public class Square extends Quadrilateral {

    public Square (int side){
        super(side, side);
    }

    @Override
    void setLength(int side) {
        this.length = side;
        this.width = side;
    }

    @Override
    void setWidth(int side) {
        this.width = side;
        this.length= side;
    }

    @Override
    public int getPerimeter() {
        return this.length * 4;
    }

    @Override
    public int getArea() {
        return this.length * this.width;
    }
}
