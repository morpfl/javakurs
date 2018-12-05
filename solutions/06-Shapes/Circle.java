
public class Circle extends Shape {
	private int numberOfCorners;
	private double radius;
	private final double pi = 3.14159;
	
	public Circle(double radius, String color, int id) {
		super(color, id);
		this.radius = radius;
		this.numberOfCorners = 0;
	}
	
	public int getNumberOfCorners() {
		return this.numberOfCorners;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		double area = this.pi * this.radius * this.radius;
		return area;
	}
	
	@Override
	public double calculatePerimeter() {
		double perimeter = 2 * this.pi * this.radius;
		return perimeter;
	}
}
