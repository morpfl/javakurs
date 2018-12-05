
public abstract class Shape {
	private String color;
	private int id;
	
	public Shape(String color, int id) {
		this.color = color;
		this.id = id;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public abstract double calculateArea();
	public abstract double calculatePerimeter();

}
