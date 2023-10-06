package Quadrilateral;

public class Rectangular {
    private double width;
    private double height;

    /*  CONSTRUCTOR   */
    public Rectangular(double width, double height) {
        this.width = width;
        this.height = height;
    }

   /*     METHODS     */
    public double area() {
        return this.width*this.height;
    }

    public double perimeter() {
        return (this.width+this.height)*2;
    }


/*    GETTERS & SETTERS   */
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}

    /*     FUNZIONI   */


