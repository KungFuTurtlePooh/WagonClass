import java.util.ArrayList;

public class Wagon {
  private ArrayList<Person> people;
  
  private double weight;
  private double maxWeight;
  
  private double speed;

  /*
  * 
  * Constructor for Wagon class. Sets maxWeight and speed to numbers
  * given through parameters. Sets weight to 0 and initializes people
  * ArrayList.
  * 
  */
  public Wagon(double maxW, double s) {
    this.people = new ArrayList<Person>();
    
    this.maxWeight = maxW;
    this.weight = 0;

    this.speed = s;
  }

  /*
  * 
  * Main method with tests all of the methods (Currently Commented out)
  * 
  */
  // public static void main(String[] args) {
  //   Wagon w = new Wagon(1000, 10);
  //   w.addPerson(new Person("Brian", 85));
  //   w.addPerson(new Person("Ryan", 100));
  //   System.out.println(w);

  //   System.out.println(w.findPerson("Brian"));
  //   System.out.println(w.getMaxWeight());
  //   System.out.println(w.getSpeed());
  //   System.out.println(w.getWeight());
    
  //   w.removePerson("Ryan");
  //   w.removePeopleByWeight(85);

  //   System.out.println(w);

  // }


  /*
  * 
  * Returns index of first person with name n. Does this by looping
  * through the people ArrayList and checking their names using the 
  * method getName() and comparing it to String n.
  * 
  */
  public int findPerson(String n) {
    for(int i = 0; i < people.size(); i++) {
      if(people.get(i).getName().equals(n)) {
        return i;
      }
    }
    return -1;
  }

  /*
  * 
  * Adds person p to people Arraylist. Increases weight by the person
  * p's weight and sets speed to 0 if weight is greater than maxWeight
  * 
  */
  public void addPerson(Person p) {
    people.add(p);
    weight += p.getWeight();
    
    if(weight > maxWeight) {
      speed = 0;
    }
  }

  /*
  * 
  * Removes people in people ArrayList by weight. Loops through people
  * Arraylist, starting from the last index, and checking each person
  * by calling their getWeigth() method. Decreases weight by person's
  * weight
  * 
  */
  public void removePeopleByWeight(double w) {
    for(int i = people.size() - 1; i >= 0; i--) {
      if(people.get(i).getWeight() >= w) {
        System.out.println("You removed " + people.get(i).getName());
        System.out.println("They had a weight of " + people.get(i).getWeight());

        weight -= people.get(i).getWeight();
        people.remove(i);
      }
    }
  }

  /*
  * 
  * Removes people in people ArrayList by name. Loops through people
  * Arraylist, starting from the last index, and checking each person
  * by calling their getName() method. Decreases weight by person's
  * weight.
  * 
  */
  public void removePerson(String name) {
    for(int i = people.size() - 1; i >= 0; i--) {
      if(people.get(i).getName().equals(name)) {
        System.out.println("You removed " + people.get(i).getName());
        System.out.println("They had a weight of " + people.get(i).getWeight());
        
        weight -= people.get(i).getWeight();
        people.remove(i);
      }
    }
  }

  /*
  * 
  * Returns people ArrayList
  * 
  */
  public ArrayList<Person> getPeople() {
    return people;
  }

  /*
  * 
  * Returns maxWeight double
  * 
  */
  public double getMaxWeight() {
    return maxWeight;
  }

  /*
  * 
  * Sets maxWeight to mw value
  * 
  */
  public void setMaxWeight(double mw) {
    maxWeight = mw;
  }

  /*
  * 
  * Returns weight double
  * 
  */
  public double getWeight() {
    return weight;
  }

  /*
  * 
  * Sets weight to w value
  * 
  */
  public void setWeight(double w) {
    weight = w;
  }

  /*
  * 
  * Returns speed double
  * 
  */
  public double getSpeed() {
    return speed;
  }

  /*
  * 
  * Sets speed to s value
  * 
  */
  public void setSpeed(double s) {
    speed = s;
  }

  /*
  * 
  * Returns a string with given format & variable by weight and speed
  * 
  */
  public String toString() {
    return "This wagon has a weight of " + weight + " pounds and a speed of " + speed + " mph." + " There are " + people.size() + " people on the wagon.";
  }

  
}