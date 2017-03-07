package course.Daniel.Java;

/**
 * Created by Jakars on 07/03/2017.
 */
public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle() {
    }

    public double getArea(){
        return a*b;

    }

    public double getPerimeter(){
        return (a+b)*2;

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
