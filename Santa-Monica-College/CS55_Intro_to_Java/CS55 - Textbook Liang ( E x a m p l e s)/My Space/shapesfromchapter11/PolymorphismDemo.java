package shapesfromchapter11;

public class PolymorphismDemo {
  /** Main method */
  public static void main(String[] args) {
    // Display circle and rectangle properties
    displayObject(new CircleFromSimpleGeometricObject
        (1, "red", false));
    displayObject(new RectangleFromSimpleGeometricObject
        (1, 1, "black", true));
  }

  /** Display geometric object properties */
  public static void displayObject(SimpleGeometricObject object) {
    System.out.println("An object was created, " + object.toString() + ", with color " + object.getColor() + ", and fill status " + object.isFilled());
  }
}
