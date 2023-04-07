import java.util.Scanner;

public class Runner {

    /*
     * 
     * Main runner method to show functionality and user input of the wagon class
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter max weight of your wagon");
        double weight = sc.nextDouble();
    
        System.out.println("Enter set speed of your wagon");
        double speed = sc.nextDouble();
    
        Wagon wagon = new Wagon(weight, speed);
        System.out.println(wagon);
        System.out.println("--------------------");
        System.out.println("Enter the amount of people you want on your wagon");
        int num = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < num; i++) {
          System.out.println("Enter name of person");
          String name = sc.nextLine();
          wagon.addPerson(new Person(name, (int)(Math.random() * 50 + 80))); 
        }
        System.out.println(wagon);
        System.out.println("--------------------");

    
        System.out.println("Type name of person you want to remove. If none found, then no one will be removed.");
        String removedName = sc.nextLine();
        wagon.removePerson(removedName);
    
        System.out.println(wagon);
        System.out.println("--------------------");

        System.out.println("Type weight of people you want to remove.");
        double removedWeight = sc.nextDouble();
        wagon.removePeopleByWeight(removedWeight);
    
        System.out.println(wagon);
        sc.nextLine();
        System.out.println("--------------------");

        System.out.println("Type of name of the person you want to find.");
        String findName = sc.nextLine();
    
        System.out.println("The person you are looking for is at index " + wagon.findPerson(findName));
    
        
      }
    }
