public class Main {
    public static void main(String[] args) {
      System.out.println("Parcial Armen-Goros");

      Square cuadrado= new Square(6.6);
      Shape cuadradin= new Square();
      Circle circulo= new Circle(5.5,"red",false);
      Rectangle rectangulo= new Rectangle(1.0,2.0,"red",false);

        cuadradin.setColor("purple");
        cuadradin.setIsFilled(true);


         System.out.println(String.format("Cuadrado\n Color: %s \n Lado: %f \n Relleno: %b", cuadrado.getColor(), cuadrado.getWidth(),cuadrado.isFilled()));

         System.out.println(String.format("Cuadradin \n Color: %s \n Relleno: %b", cuadradin.getColor(), cuadradin.isFilled()));

         System.out.println(String.format("Circulo \n Color: %s \n Radio: %f \n Area: %f \n Perimetro: %f \n Relleno: %b", circulo.getColor(), circulo.getRadius(),circulo.getArea(), circulo.getPerimeter(), circulo.isFilled()));

         System.out.println(String.format("Rectangulo \n Color: %s \n Ancho: %f \n Largo: %f \n Area: %f \n Perimetro: %f \n Relleno: %b",
                 rectangulo.getColor(),rectangulo.getWidth(),rectangulo.getLength(),rectangulo.getArea(),rectangulo.getPerimeter(),rectangulo.isFilled()));












    }

}
