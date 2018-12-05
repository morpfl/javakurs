
public class Parallelogram extends Quadrilateral {
	private double height_length;
	
	public Parallelogram(double length, double width, String color, int id, double height_length) {
		super(length, width, color, id);
		this.height_length = height_length;
	}
	
	@Override
	public double calculateArea() {
		double area = super.getLength() * this.height_length;
		return area;
	}
}
