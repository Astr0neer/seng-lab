package lab7;

public class TestGeometricObject {

  public static void main(String[] args) {
    GeometricObject geoObject1 = new Rectangle(4, 5, "Red", true);
    GeometricObject geoObject2 = new Rectangle(3, 6, "Blue", false);

    System.out.println("Rectangle 1 Area: " + ((Rectangle) geoObject1).getArea());
    System.out.println("Rectangle 1 Perimeter: " + ((Rectangle) geoObject1).getPerimeter());
    System.out.println("Rectangle 1 Color: " + geoObject1.getColor());
    System.out.println("Rectangle 1 Filled: " + geoObject1.isFilled());

    System.out.println();

    System.out.println("Rectangle 2 Area: " + ((Rectangle) geoObject2).getArea());
    System.out.println("Rectangle 2 Perimeter: " + ((Rectangle) geoObject2).getPerimeter());
    System.out.println("Rectangle 2 Color: " + geoObject2.getColor());
    System.out.println("Rectangle 2 Filled: " + geoObject2.isFilled());

    GeometricObject geoObject3 = new Circle(7, "Green", true);
    System.out.println();
    System.out.println("Circle Area: " + ((Circle) geoObject3).getArea());
    System.out.println("Circle Diameter: " + ((Circle) geoObject3).getDiameter());
    System.out.println("Circle Color: " + geoObject3.getColor());
    System.out.println("Circle Filled: " + geoObject3.isFilled());
    
  }
}
