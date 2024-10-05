/*
 * Represents a plushie that can be sold at an online store
 * Plushie is a type of Toy Animal
 */
public class Plushie extends ToyAnimal {

  private int plushieColor;      // Specifies the type of color 

  /*
   * Sets the plushieColor to 0
   */
  public Plushie() {
    plushieColor = 0;
  }

  /*
   * Sets the animal to the specified animal, the length to the
   * specified length, hasColor to the specified color, and 
   * plushieColor to the specified status
   */
  public Plushie(String animal, double length, boolean hasColor, int plushieColor) {
    super(animal, length, hasColor);
    this.plushieColor = plushieColor;
  }

  /*
   * Returns the value assigned to plushieColor
   */
  public int getPlushieColor() {
    return plushieColor;
  }

  public void setPlushieColor(int plushieColor) {
    this.plushieColor = plushieColor;
  }

  public String toString() {

    String color = "";

    if (plushieColor == 1) {
      color = "Red";
    } else if (plushieColor == 2) {
      color = "Orange";
    } else if (plushieColor == 3) {
      color = "Yellow";
    } else if (plushieColor == 4) {
      color = "Green";
    } else if (plushieColor == 5) {
      color = "Blue";
    } else if (plushieColor == 6) {
      color = "Purple";
    } else if (plushieColor == 7) {
      color = "Pink";
    } else if (plushieColor == 8) {
      color = "Brown";
    } else if (plushieColor == 9) {
      color = "Gray";
    }
      
    return super.toString() + "\nPlushie Color: " + color;
  }
  
}