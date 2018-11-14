public class Vehicle{

  // Attribute
  private int numberOfWheels;
  public  String brand;
  public  boolean payTaxes;

  //Konstruktor der Klasse Vehicle
  public Vehicle(String brand, int numberOfWheels){
    this.brand = brand;
    this.payTaxes = true;
    this.numberOfWheels = numberOfWheels;
  }

  // Getter
  public int getNumberOfWheels(){
    return this.numberOfWheels;
  }

  public String getBrand(){
    return this.brand;
  }

  public boolean getPayTaxes(){
    return this.payTaxes;
  }

  // toString()-Methode, wird zB. bei 'System.out.print(Vehicle)' ausgeführt
  public String toString(){
    return this.brand;
  }
}
