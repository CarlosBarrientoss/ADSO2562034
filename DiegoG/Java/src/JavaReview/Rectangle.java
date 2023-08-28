package JavaReview;

public class Rectangle extends FigureModel {

    public Rectangle(int base, int height) {
        super(base, height);
    }

   public void getPerimeter() {
       System.out.println("Area of the rectangle is: " + ((base * 2) + (height * 2)));
   }

   public void getArea() {
       System.out.println("Area of rectangle is: " + base * height);
   }

}