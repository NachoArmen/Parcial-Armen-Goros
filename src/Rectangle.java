public class Rectangle extends Shape {

   public double width;
   public double length;

    Rectangle(){
    this.width=1.0;
    this.length=1.0;

   }

   Rectangle(double width, double length){
       this.width=width;
       this.length=length;
   }

   Rectangle(double width, double length, String color, boolean isFilled){
       this.width=width;
       this.length=length;
       this.color=color;
       this.isFilled=isFilled;
   }

    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    public double getLength() {

        return length;
    }

    public void setLength(double length) {

        this.length = length;
    }

    @Override
    double getArea() {

        return (width*length);
    }

    @Override
    double getPerimeter() {

        return ((width*2)+(length*2));
    }
}
