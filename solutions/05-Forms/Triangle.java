
public class Triangle {
	private int numberOfCorners;
	private double c;
	private double hc;
	
	public Triangle(double c, double hc) {
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
}
