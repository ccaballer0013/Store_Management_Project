/*
 * Represents a figure that can be sold at an online store
 * Figure is a type of toy animal
 */
public class Figure extends ToyAnimal {

  private String coating;   // If the coating is matte or glossy

  /*
   * Sets coating to 0
   */
  public Figure() {
    coating = "";
  }

  /*
   * Sets the animal to the specified animal, the length to the
   * specified length, hasColor to the specified color, and 
   * coating to the specified status
   */
  public Figure(String animal, double length, boolean hasColor, String coating) {
    super(animal, length, hasColor);
    this.coating = coating;
  }

  /*
   * Returns the value assigned to coating
   */
  public String getCoating() {
    return coating;
  }

  /*
   * Sets coating to coating
   */
  public void setCoating(String coating) {
    this.coating = coating;
  }

  /*
   * toString() Method Override
   */
  public String toString() {

    String coatingType = "";
    if (coating == "1") {
      coatingType += "Matte";
    } else {
      coatingType += "Glossy";
    }
    
    return super.toString() + "\nCoating Type: " + coatingType;
  }
 
}