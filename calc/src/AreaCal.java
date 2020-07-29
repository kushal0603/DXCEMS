abstract class Shape{
	 abstract double getArea();

}
 class Rectangle extends Shape
 {
	 double length;
	 double breadth;
	 
	 public Rectangle (double length, double breadth)
	 {
		 this.length=length;
		 this.breadth=breadth;
		 
	 }
	 double getArea()
	 {
		 return length*breadth;
	 }
 }
 class Square extends Shape
 {
	 double side;
	 public Square(double side)
	 {
		 this.side=side;
		 
	 }
	 double getArea()
	 {
		 return side*side;
	 }
 }
 class Circle extends Shape
 {
	 double radius;
	 public Circle(double radius)
	 {
		 this.radius=radius;
		 
	 }
	 double getArea()
	 {
		 return (22.0/7.0)*radius;
	 }
 }
 public class AreaCal
 {
	 public static void main(String[] args)
	 {
		 Square square=new Square(7);
		 System.out.println(square.getArea());
		 
		 Rectangle rectangle=new Rectangle(5,6);
		 System.out.println(rectangle.getArea());
		 
		 Circle circle=new Circle(8);
		 System.out.println(circle.getArea());
		 
	 }
	 
	 
	 
 }
