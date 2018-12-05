
public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(3.4, "blue", 1);
		Parallelogram parallelogram = new Parallelogram(2.3, 5.4, "grey", 2, 2.4);
		Square square = new Square(5, "red", 3);
		
		Shape[] shape = new Shape[3];
		shape[0] = circle;
		shape[1] = parallelogram;
		shape[2] = square;
		
		for(int i = 0; i < shape.length; i++) {
			System.out.println("The shape is a: " + shape[i].getClass());
			System.out.println("The color of the shape is: " + shape[i].getColor());
			System.out.println("The area of it: " + shape[i].calculateArea());
			System.out.println("The perimeter of it: " + shape[i].calculatePerimeter());
			System.out.println("---------------------------------------------");
		}
	}
}
