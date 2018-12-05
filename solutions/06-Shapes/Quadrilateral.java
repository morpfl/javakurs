
public class Quadrilateral extends Shape {
	
	private int numberOfCorners;
	private double length;
	private double width;
	

	public Quadrilateral(double length, double width, String color, int id) {
		super(color, id);
		this.length = length;
		this.width = width;
		this.numberOfCorners = 4;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public int getNumberOfCorners(){
		return this.numberOfCorners;
	}
	
	@Override
	public double calculateArea() {
		double area = this.length * this.width;
		return area;
	}
	
	@Override
	public double calculatePerimeter() {
		double perimeter = 2 * this.length + 2 * this.width;
		return perimeter;
	}
}
