public class Square extends Rectangle{

    public double side;
    Square(){
       this.side=1.0;
    }

    Square(double side){

        this.side=side;
    }

    Square(double side, String color, boolean isFilled){
        this.side=side;
        this.color=color;
        this.isFilled=isFilled;


    }

    public double getLength() {
        return super.getLength();
    }


    public double getWidth() {
        return super.getWidth();
    }

    public void setWidth(){

        this.setWidth(side);
    }
    public void setLength(){
        this.setLength(side);
    }

    @Override
    double getArea() {

        return (width*length);
    }

    @Override
    double getPerimeter() {

        return (width*4);
    }
}
