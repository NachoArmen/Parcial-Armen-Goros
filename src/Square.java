public class Square extends Rectangle{
    public double side;



    Square(){

    }

    Square(double side){
        this.side=side;
    }

    Square(double side, String color, boolean isFilled){
        this.side=side;
        this.color=color;
        this.isFilled=isFilled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        setWidth(side);
    }

    public void setWidth(double side){
        this.setWidth(side);
    }
}
