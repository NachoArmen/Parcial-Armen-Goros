public class Circle extends Shape {

    private double radius;
    Circle(){

    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    Circle(double radius){
        this.radius(1.0);
    }
    Circle(double radius,String color ){

    }
    private void radius(double v) {
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
