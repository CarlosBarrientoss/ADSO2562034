package JavaReview;

public class Triangle extends FigureModel {

    public Triangle(int base, int height) {
        super(base, height);
    }

    public void getArea() {
        System.out.println("Area of triangle is: " + (base * height)/2 );
    }

}