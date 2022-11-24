abstract class Shape {
    public String color;
    public boolean isFilled;
    public double area;
    public double perimeter;



    Shape (){
        this.color="red";
        this.isFilled= true;
    }
    Shape(String color , boolean isFilled){
        this.color= color;
        this.isFilled= isFilled;
    }
    public String getColor(){

        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public boolean isFilled(){

        return isFilled;
    }
    public void setIsFilled(boolean isFilled){

        this.isFilled=isFilled;
    }
    abstract double getArea();
    abstract double getPerimeter();



}
