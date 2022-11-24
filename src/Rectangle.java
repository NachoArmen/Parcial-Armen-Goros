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

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }
}
