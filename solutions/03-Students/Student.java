
public class Student {

	// Attribute
	String forename;
	String name;
	long matNumber;

	//Konstruktor
	public Student(String forename, String name, long matNumber) {
		this.forename = forename;
		this.name = name;
		this.matNumber = matNumber;
	}

	// Methoden
	public String getForename() {
		return this.forename;
	}

	public String getName() {
		return this.name;
	}

	public long getMatNumber() {
		return this.matNumber;
	}
}
