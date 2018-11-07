
public class JavaCourse {

	// Attribute
	private long[] matNumbersTutors; //Array vom Typ 'long'
	private int numberOfLessons;
	private Student[] attendees; // Array vom Typ 'Student'

	// Konstruktor
	public JavaCourse(long[] tutors, int numberOfLessons, Student[] attendees) {
		this.matNumbersTutors = tutors;
		this.numberOfLessons = numberOfLessons;
		this.attendees = attendees;
	}

	//Methoden

	// schreibt die Stundenten aus 'attendees' in die Konsole
	public void printAttendees() {
		for(int i = 0; i < attendees.length; i++) {
			String forename = attendees[i].getForename();
			String lastname = attendees[i].getName();
			long matNumber = attendees[i].getMatNumber();
			System.out.println("Student " + (i+1) + ": forename: " + forename + ", lastname: " + lastname + ", matricle number: " + matNumber);
		}
	}

	// 'getter' für numberOfLessons
	public int getNumberOfLessons() {
		return this.numberOfLessons;
	}

	// 'setter' für numberOfLessons
	public void setNumberOfLessons(int numberOfLessons) {
		this.numberOfLessons = numberOfLessons;
	}

	public void printMatNumbersOfTutors() {
		for(int i = 0; i < matNumbersTutors.length; i++) {
			System.out.println("Tutor " + (i+1) + ": " + matNumbersTutors[i]);
		}
	}

}
