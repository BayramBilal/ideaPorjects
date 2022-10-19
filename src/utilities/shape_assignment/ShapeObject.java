package day43_Abstraction.shape_assignment;

public class ShapeObject {

    public static void main(String[] args) {

   //  Shape shape = new Shape() ;


        Circle circle = new Circle (4);

        System.out.println(circle);

        Rectangle rectangle = new Rectangle(5,10);
         System.out.println(rectangle);

        rectangle.setLength(12);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle);


        Square square = new Square(4);
        System.out.println(square);
        square.setSide(16);
        System.out.println(square.getSide());
        System.out.println(square);
    }
}
