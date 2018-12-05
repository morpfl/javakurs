
public class Triangle extends Shape {
	private int numberOfCorners;
	private double a;
	private double b;
	private double c;
	private double hc;
	
	public Triangle(double a, double b,double c, double hc, String color, int id) {
		super(color, id);
		this.a = a;
		this.b = b;
		this.c = c;
		this.hc = hc;
		this.numberOfCorners = 3;
	}
	
	public double getNumberOfCorners() {
		return this.numberOfCorners;
	}
	
	public void setC(double c) {
		this.c = c;
	}
	
	public double getC() {
		return this.c;
	}
	
	public void setHc(double hc) {
		this.hc = hc;
	}
	
	public double getHc() {
		return this.hc;
	}
	@Override
	public double calculateArea() {
		double area = this.c * this.hc / 2;
		return area;
	}
	@Override
	public double calculatePerimeter() {
		double perimeter = this.a + this.b + this.c;
		return perimeter;
	}
}
