package OOP.Interface1;

public class Test {
    public static void main(String[] args) {

        Square square = new Square();

        System.out.println(square.area(4));
        System.out.println(square.perimeter());
        //you cannot create object from interface

        Shape shape = new Square();

        System.out.println(shape.area(5));

        System.out.println(shape.SIDE);//calling by object
        System.out.println(Shape.SIDE);//calling by class name
        System.out.println(square.SIDE);

        //square.SIDE = 4; you cannot reassign final variable

        Triangle triangle  = new Triangle();
        triangle.height=7;
        System.out.println(triangle.height);
        System.out.println(triangle.area(8));

        //shape.height(); --cannot reach child class

        shape.info();
        square.info();
        triangle.info();

        //square.info("");



    }
}
