import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    // Prints introduction statement to the user
    System.out.println("Welcome to Toy Animal Shop! You can purchase your choice of customized animal in the form of a figure or plushie. (\"Enter\" to continue)");
    input.nextLine();
    
    // Prints question asking the user if the toy is a figure or plushie
    System.out.println("Would you like your toy animal to be: \n1) Figure \n2) Plushie \nPlease enter \"1\" or \"2\"");
    String userType = input.nextLine();

    // Sets type to "figure" or "plushie" depending on the inputted numerical value
    String type = "0";
    if (userType == "1") {
      type = "figure";
    } else {
      type = "plushie";
    }

    // Prints continuation statement to the user
    System.out.println("Great! Now please complete the following questions to complete your " + type + " order. (\"Enter\" to continue)");
    input.nextLine();
    
    // If the user chose figure, a figure object is instantiated
    if (type == "figure") {
      Figure a = new Figure();

      System.out.println("What type of animal would you like your toy to be?");
      String userAnimal = input.nextLine();
      a.setAnimal(userAnimal);
  
      System.out.println("What would you like the height of your toy to be (inches)?");
      double userLength = input.nextDouble();
      a.setLength(userLength);
  
      System.out.println("Will your toy aniaml have multiple colors? ");
      boolean userHasColor = input.nextBoolean();
      a.setHasColor(userHasColor);

      System.out.println("Will the coating of your animal figure be \n1) Matte \n2) Glossy \nPlease enter \"1\" or \"2\"");
      String userCoating = input.nextLine();
      a.setCoating(userCoating);
      
      System.out.println(a);
    } else { 
      // If the user chose plushie, a plushie object is instantiated
      Plushie b = new Plushie();

      System.out.println("What type of animal would you like your toy to be?");
      String userAnimal = input.nextLine();
      b.setAnimal(userAnimal);
  
      System.out.println("What would you like the length of your toy to be (inches)?");
      double userLength = input.nextDouble();
      b.setLength(userLength);
  
      System.out.println("Will your toy animal have multiple colors? Enter \"true\" or \"false.\"");
      boolean userHasColor = input.nextBoolean();
      b.setHasColor(userHasColor);
      
      System.out.println("What shade of color will your plushie be? \n1) Red \n2) Orange \n3) Yellow \n4) Green \n5) Blue \n6) Purple \n7) Pink \n8) Brown \n9) Gray");
      int userPlushieColor = input.nextInt();
      b.setPlushieColor(userPlushieColor);
      
      System.out.println(b);
    }

    System.out.println("Examples of the superclass and subclass");

    // Instantiates parameterized objects from the ToyAnimal class and prints the values
    ToyAnimal a1 = new ToyAnimal("tiger", 5, true);
    System.out.println("------------ Animal 1 -------------");
    System.out.println(a1);
    
    ToyAnimal animal2 = new ToyAnimal("ant", 8, false);
    System.out.println("------------ Animal 2 -------------");
    System.out.println(animal2);
    
    ToyAnimal animal3 = new ToyAnimal("cat", 5, true);
    System.out.println("------------ Animal 3 -------------");
    System.out.println(animal3);
    
    // Instantiates parameterized objects from the Figure class and prints the values
    Figure figure1 = new Figure("hawk", 10.5, true, "2");
    System.out.println("------------ Figure 1 -------------");
    System.out.println(figure1);
    
    Figure figure2 = new Figure("elephant", 4, true, "1");
    System.out.println("------------ Figure 2 -------------");
    System.out.println(figure2);
    
    Figure Figure3 = new Figure("flamingo", 7, true, "2");
    System.out.println("------------ Figure 3 -------------");
    System.out.println(Figure3);
    
    // Instantiates parameterized objects from the Plushie class and prints the values
    Plushie plushie1 = new Plushie("giraffe", 7.8, true, 3);
    System.out.println(plushie1);
    System.out.println("------------ Plushie 1 -------------");
    
    Plushie plushie2 = new Plushie("elephant", 4, true, 6);
    System.out.println("------------ Plushie 2 -------------");
    System.out.println(plushie2);
    
    Plushie plushie3 = new Plushie("flamingo", 7, true, 8);
    System.out.println("------------ Plushie 3 -------------");
    System.out.println(plushie3);


    // Closes the Scanner object
    input.close();
    
  }
}