public class Main{
  public static void main(String[] args) {

    // Erstellen von 6 Studenten
    Student student01 = new Student("Erika", "Mustermann", 483950);
    Student student02 = new Student("Max", "Mustermann", 2940203);
    Student student03 = new Student("Bulrike", "Aumann", 9815363);
    Student student04 = new Student("Gandalf", "der Rosane", 4783943);
    Student student05 = new Student("Rubeus", "Hagrid", 91425362);
    Student student06 = new Student("Chew", "bacca", 7230583);

    // Erstelltung von zwei verschiedenen Arrays
    Student[] students = new Student[6];
    long[] tutorMatNumbers = new long[2];

    // Einfügen der Studenten in das Array
    students[0] = student01;
    students[1] = student02;
    students[2] = student03;
    students[3] = student04;
    students[4] = student05;
    students[5] = student06;

    // Einfügen der Nummern in das Array
    tutorMatNumbers[0] = 2747328L;
    tutorMatNumbers[1] = 2747328L;

    int lessons = 15;

    // Erstellen des Java-Kurs
    JavaCourse bestJavaCourse = new JavaCourse(tutorMatNumbers, lessons, students);

    // Ausgaben in die Konsole
    System.out.println("The Java-Course has the following attendees: ");
    bestJavaCourse.printAttendees();

    System.out.println("There are " + bestJavaCourse.getNumberOfLessons() + " lessons.");

    System.out.println("The tutors have the following matricle numbers: ");
    bestJavaCourse.printMatNumbersOfTutors();

    }
}
