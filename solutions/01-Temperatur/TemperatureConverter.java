/*
  We learned:
    -data-types
    -declaration and assignment
    -calculating with numbers
    -printing to the console
*/

public class TemperatureConverter{
  public static void main(String[] args){
    float temperature1; //declared temperature1
    temperature1 = 20;  //assigned temperature1
    float temperature2 = 40; // declared AND assigned temperature1
    float temperature3 = 120.0f; // adding the 'f' is necessary because of the floating point

    temperature1 = temperature1 * 1.8f + 32;
    /* notice that adding the 'f' to 1.8 is really important here:
      a * b = c
      if we want c to be a float, both a AND b need to be a float as well!*/
    temperature2 = temperature2 * 1.8f + 32;
    temperature3 = temperature3 * 1.8f + 32;

    // we print our results to the console
    System.out.println(temperature1);
    System.out.println(temperature2);
    System.out.println(temperature3);
  }
}
