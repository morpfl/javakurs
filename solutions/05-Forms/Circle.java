
public class Circle {
	private int numberOfCorners;
	private double radius;
	
	public Circle(double radius) {
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
}
