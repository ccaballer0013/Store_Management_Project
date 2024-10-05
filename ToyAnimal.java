/*
 * Represents a toy animal that can be sold at an online store
 */
public class ToyAnimal {

  // Instance variables
  private String animal;     // The type of animal of the toy
  private double length;     // The length of the toy animal
  private boolean hasColor;  // Whether or not the toy animal has color

  // Constructor Methods

  /*
   * No-argument
   * Sets animal to "no type", length to 0.0, and hasColor to false
   */
  public ToyAnimal() {
    this("no type", 0.0, false);
  }

  /* 
   * Parameterized
   * Sets animal to the specified animal, length to the specified length
   * and hasColor to the speciifc boolean value
   */
  public ToyAnimal(String animal, double length, boolean hasColor) {
    this.animal = animal;
    this.length = length;
    this.hasColor = hasColor;
  }


  // Accessor and Mutator Methods

  /* 
   * Returns the value assigned to animal
   */
  public String getAnimal() {
    return animal;
  }

  public void setAnimal(String animal) {
    this.animal = animal;
  }


  /* 
   * Returns the value assigned to length
   */
  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  /* 
   * Returns the value assigned to hasColor
   */
  public boolean getHasColor() {
    return hasColor;
  }

  public void setHasColor(boolean hasColor) {
    this.hasColor = hasColor;
  }

  // MUTATOR METHODS

  
  // toString Method Override
  public String toString() {
    
    return "Animal: " + animal + "\nLength: " + length + " in" + "\nHas Color: " + hasColor;
    
  }

}