public class Garage{

  public static void main(String[] args){

    // Wir legen von jeder Klasse ein Objekt an
    Car car1 = new Car("Fiat", false);
    ElectricCar electricar2 = new ElectricCar("Audi", true, 123456789L);
    Motorcycle motorcycle3 = new Motorcycle("Enduro");

    // und schreiben die Eigenschaften zum Test in die Konsole
    System.out.println(car1 + ", " + car1.getNumberOfWheels() + " wheels, payTaxes: " + car1.getPayTaxes());
    System.out.println(electricar2 + ", " + electricar2.getNumberOfWheels() + " wheels, payTaxes: " + electricar2.getPayTaxes());
    System.out.println(motorcycle3 + ", " + motorcycle3.getNumberOfWheels() + " wheels, payTaxes: " + motorcycle3.getPayTaxes());

  }
}
