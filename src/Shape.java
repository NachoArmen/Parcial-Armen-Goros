abstract class Shape {
    public String color;
    public boolean isFilled;
    public double area;
    public double perimeter;
    public String text;



    Shape (){

    }
    Shape(String color , boolean isFilled){

    }
    public String getColor(){
      return color;
}

    public void setColor(String color){
        this.color="red";
}

    public boolean isFilled(){
        return isFilled;
}
    public void setisFilled(boolean isFilled){
        this.isFilled=true;
}
    abstract double getArea();
    abstract double getPerimeter();



}
