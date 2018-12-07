public class Professor implements Human {

  private int salary;
  private boolean isLearning = false;
  public String title;

  public Professor(){
    this.salary = 1000;
    this.title = "Prof.";
  }

  public int getSalary(){
    this.salary += 100;
    return salary;
  }

  public String celebrate(int drinkNumber){
    // der Professor trinkt immer dasselbe, unabhängig von drinkNumber
    return "Sitze auf der Couch und trinke ein Glas Wein.";
  }

  public boolean isTired(){
    return false;
  }

  public void learn(){
    this.isLearning = false;
  }
}
