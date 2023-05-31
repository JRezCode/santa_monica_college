package chapter11;

public class PolymorphismDemo {
  /** Main method */
  public static void main(String[] args) {
    // Display circle and rectangle properties
    displayObject(new CircleFromSimpleGeometricObject
        (1, "red", false));
    displayObject(new RectangleFromSimpleGeometricObject
        (1, 1, "black", true));
  }

  //Represents altered code below
  /** Display geometric object properties */
  public static void displayObject(SimpleGeometricObject object) {
    System.out.println("An object was " + object);
  }
}
