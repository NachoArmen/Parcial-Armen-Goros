public class Main {
    public static void main(String[] args) {
      System.out.println("Parcial Armen-Goros");

      Square cuadrado= new Square(2,"green",false);
      Shape cuadradin= new Square();
      Shape circulo= new Circle(1.0,"yellow",true);
      Rectangle rectangulo= new Rectangle(1.0,2.0,"red",false);

        cuadradin.setColor("purple");
        cuadradin.setIsFilled(true);




         System.out.println(String.format("Color: %s \n "));

         System.out.println(String.format(""));

         System.out.println(String.format(""));

         System.out.println(String.format("Color: %s \n Ancho: %f \n Largo: %f \n Area: %f \n Perimetro: %f \n Relleno: %b",
                 rectangulo.getColor(),rectangulo.getWidth(),rectangulo.getLength(),rectangulo.getArea(),rectangulo.getPerimeter(),rectangulo.isFilled()));



    }

}
