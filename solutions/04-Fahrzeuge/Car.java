//mit extends Vehicle erbt die Klasse von Vehicle
public class Car extends Vehicle {

  // hier stehen nur noch die zusätzlichen Attribute zusätzlich zu den in Vehicle definierten
  private boolean hasAutoPilot;

  public Car(String brand, boolean hasAutoPilot){
    //wir sparen uns die Arbeit und rufen direkt den Konstruktor der Superklasse auf
    super(brand, 4);
    this.hasAutoPilot = hasAutoPilot;
  }

  public boolean hasAutoPilot(){
    return this.hasAutoPilot;
  }

}
