public class Library{

  // Wenn wir Library ausführen wird automatisch die 'main'-Methode ausgeführt, hier startet also unser Programm
  public static void main(String[] args){

    Book meinBuch = new Book("Harry Potter", 123456789); // Wir erstellen ein neues Objekt Buch und rufen den Konstruktor mit Titel und ISBN ausführen
    Book meinAnderesBuch; // Wir deklarieren ein Buch; mehr aber auch nicht
    meinAnderesBuch = new Book("Game of Thrones", 987654321); // erst mit dem Stichwort 'new' und dem Aufruf des Konstruktor erzeugen wir ein neues Objekt
    System.out.println(meinBuch.bookName); // mithilfe des '.' greifen wir auf Attribute und Methoden des Objekts zu; hier den Titel
    System.out.println(meinAnderesBuch.getISBN());
    // meinBuch.isbn können wir nicht direkt aufrufen, da wir das Attribut innerhalb der Klasse Book auf 'private' gesetzt haben
  }
}
