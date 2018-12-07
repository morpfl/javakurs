// Die Klasse Student soll das Interface implementieren
public class Student implements Human {

  private int salary;
  private boolean isLearning;

  public Student(){
    this.salary = 0;
    this.isLearning = false;
  }

  // daher müssen wir auch alle Methoden, die das Interface vorgibt implementieren
  public int getSalary(){
    salary += 20;
    return this.salary;
  }

  public String celebrate(int drinkNumber){
    String celebrationString = "Gehe in die Neustadt und trinke ";

    // da wir mit 'return' sowieso die Funktion komplett verlassen, benötigen wir kein 'break;' nach jedem case
    switch(drinkNumber){
      case 0: return celebrationString + "ein Sterni.";
      case 1: return celebrationString + "ein Glas Wein.";
      case 2: return celebrationString + "Wodka. Pur. 0,7L.";
      // der 'default'-case wird aufgerufen, wenn keiner der anderen cases erfüllt ist
      default: return celebrationString + "nichts, da ich ein vorbildlicher Student bin.";
    }
  }

  // Funktion ist überladen, existiert 2 mal mit verschieden Übergabeparametern
  public String celebrate(Drink drink){
    boolean drinking = drink.drink();
    if(drinking){
      return "Ich habe erfolgreich " + drink.toString() + " getrunken";
    }
    else{
      return "Ich konnte " + drink.toString() + " nicht trinken.";
    }

  }

  public boolean isTired(){
    return true;
  }

  public void learn(){
    this.isLearning = true;
  }

}
