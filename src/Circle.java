public class Circle extends Shape {
    private double radius;

    Circle(){

        this.radius=1.0;
    }
    Circle(double radius){

        this.radius=radius;
    }
    Circle(double radius,String color, boolean isFilled){
        this.radius=radius;
        this.color=color;
        this.isFilled=isFilled;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    @Override
    double getArea() {

        return (3.1416*(radius*radius));
    }

    @Override
    double getPerimeter() {

        return (2*3.1416*radius);
    }
}
