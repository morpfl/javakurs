public class ElectricCar extends Car{

  private long capacity;

  public ElectricCar(String brand, boolean hasAutoPilot, long capacity){
    super(brand, hasAutoPilot);
    this.capacity = capacity;
    this.payTaxes = false;
  }

  public long getCapacity(){
    return this.capacity;
  }

  /*
    mit @Override signalisieren wir, dass wir die Methode toString() aus Vehicle 
    überschreiben wollen
  */
  @Override
  public String toString(){
    return super.toString() + ", " + this.capacity;
  }

}
