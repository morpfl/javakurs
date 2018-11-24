
public class Quadrilateral {
	
	private int numberOfCorners;
	private double length;
	private double width;
	

	public Quadrilateral(double length, double width) {
		this.length = length;
		this.width = width;
		this.numberOfCorners = 4;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLaenge() {
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
}
