import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

class Main{
    public static void main (String[] args){
        Shape Obj = new Circle(5);
        Shape Obj1 = new Rectangle(10,2);

        System.out.println("Area of the Circle: " + Obj.calculateArea());
        System.out.println("Perimeter of the Circle: " + Obj.calculatePerimeter());

        System.out.println("Area of the Rectangle: " + Obj1.calculateArea());
        System.out.println("Perimeter of the Rectangle: " + Obj1.calculatePerimeter());

}
}