package shapes;


import util.Input;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(){

    }

    public Rectangle(int length, int width){
        this.width = width;
        this.length = length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getLength(){
        return length;
    }

    public  int getWidth(){
        return width;
    }

    public int getArea(){
        return this.length * this.width;
    }

    public int getPerimeter(){
        return 2 * this.length + 2 * this.width;
    }

}
