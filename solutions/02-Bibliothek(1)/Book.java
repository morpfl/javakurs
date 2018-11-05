// Klasse Buch, "Bauplan eines Buches"
public class Book{

  // Attribute, "Eigenschaften der Klasse"
  public String bookName; // public, "jeder kann auf dieses Attribut zugreifen"
  private long isbn; // private, "nur die eigene Klasse kann auf dieses Attribut zugreifen"

  // Konstruktor, wird ausgeführt wenn eine Instanz der Klasse erzeugt wird
  public Book(String name, long isbn){
    bookName = name; //  wir weißen dem Attribut einen Wert zu, der bei Erzeugung übergeben wird
    this.isbn = isbn; // mit 'this.' greifen wir auf das Attribut in dieser Klasse zu, 'this.' referenziert also sich selbst
  }

  // eine öffentliche Methode, die bei Ausführung einen 'long' zurückgibt
  public long getISBN(){
    return this.isbn; /* da 'isbn' ein privates Attribut ist können wir nicht direkt darauf zugreifen
                        mit dieser Methode können wir es allerdings abfragen
                        damit stellen wir sicher, dass keine andere Klasse 'isbn' verändern,
                        aber trotzdem den Wert abfragen kann
                      */
  }
}
