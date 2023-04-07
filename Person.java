public class Person {
  private String name;
  private double weight;
  
  /*
  *
  * Constructor for Person class. Sets name and weight to given
  * parameters.
  *
  */
  public Person(String n, double w) {
    this.name = n;
    this.weight = w;
  }

  /*
  *
  * Returns name String of person
  *
  */

  public String getName() {
    return name;
  }

  /*
  *
  * Returns weight Double of person
  *
  */

  public double getWeight() {
    return weight;
  }
}