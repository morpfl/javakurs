# Übung 3

In dieser Übung wollen wir unseren Java-Kurs nachbauen und dabei alles
verwenden, was wir bisher gelernt haben!
(**Hinweis:** Wenn du einen Blick in die Klasse `Main` wirfst (unten), kannst du sehen,
wie wir das fertige Programm benutzen wollen)

- **Student**: Modelliere eine Klasse `Student`. Der Student hat 3 *Attribute*:
    - seinen Vornamen `forename`
    - seinen Nachnamen `name`
    - seine Matrikelnummer `matNumber`

  außerdem hat er 3 Methoden, die sogenannten *getter*. Diese sollen
  jeweils ein Attribut zurückgeben (als *return*-Wert haben):
  Beispiel: `getForename()` soll den `forename` zurückgeben

    (**Hinweis**: Vergesse nicht den Konstruktor (`public Student(...` zu schreiben!)

- **JavaCourse**: Modelliere außerdem die Klasse `JavaCourse`. Er besitzt folgende
Attribute:
    - die Matrikelnummern seiner Tutoren `matNumbersTutors`
    - die Anzahl seiner Veranstaltungen `numberOfLessons`
    - die Teilnehmer `attendees`
    - (**Hinweis:** Überlege welcher neu gelernte Datentyp geeignet ist, um
    Listen von mehreren Elemente wie zB. die `matNumbersTutors` oder die `attendees` zu speichern)

  Außerdem hat der JavaCourse folgende Methoden:
  - `printAttendees()` schreibt hintereinander alle Teilnehmer des Kurses in die
  Konsole
  - `getNumberOfLessons()` ist ein *getter*, der `numberOfLessons` zurückgibt
  - `setNumberOfLessons(int numberOfLessons)` ist ein *setter* der `numberOfLessons`
  einen neuen Wert zuweist
  - `printMatNumbersOfTutors()` schreibt die Matrikelnummern der Tutoren auf die
  Konsole
  - (**Hinweis:** Vergesse auch hier nicht den Konstruktor!)


- **Main/Ausführung**:
Wir haben dir schon eine `Main`-Klasse fertig geschrieben. Wenn du deine
eigenen 2 Klassen fertig geschrieben hast, kannst du sie testen, in dem du
eine dritte Klasse `Main.java` erstellst und dort unseren Code einsetzt, oder
auf [github.com/morpfl/javakurs/Excercises/03-Students/](github.com/morpfl/javakurs/Excercises/03-Students/) die fertige Klasse downloadest.

```
public class Main{
  public static void main(String[] args) {

    Student student01 = new Student("Erika", "Mustermann", 483950);
    Student student02 = new Student("Max", "Mustermann", 2940203);
    Student student03 = new Student("Bulrike", "Aumann", 9815363);
    Student student04 = new Student("Gandalf", "der Rosane", 4783943);
    Student student05 = new Student("Rubeus", "Hagrid", 91425362);
    Student student06 = new Student("Chew", "bacca", 7230583);

    Student[] students = new Student[6];
    long[] tutorMatNumbers = new long[2];

    students[0] = student01;
    students[1] = student02;
    students[2] = student03;
    students[3] = student04;
    students[4] = student05;
    students[5] = student06;

    tutorMatNumbers[0] = 2747328L;
    tutorMatNumbers[1] = 2747328L;

    int lessons = 15;

    JavaCourse bestJavaCourse = new JavaCourse(tutorMatNumbers, lessons, students);

    System.out.println("The Java-Course has the following attendees: ");
    bestJavaCourse.printAttendees();

    System.out.println("There are " + bestJavaCourse.getNumberOfLessons() + " lessons.");

    System.out.println("The tutors have the following matricle numbers: ");
    bestJavaCourse.printMatNumbersOfTutors();
    }
}
```
