package lab6;

public class TestFlowerBasket {
  public static void main(String[] args) {
    Flower rose = new Flower("Pink", "Rose", 1.5);
    Bouquet valentinesBouquet = new Bouquet("Romantic", 12, rose);
    System.out.println("Bouquet Theme: " + valentinesBouquet.getTheme());
    System.out.println("Number of Flowers: " + valentinesBouquet.getNumberOfFlowers());
    System.out.println("Flower Type: " + valentinesBouquet.getFlower().getName());
    System.out.println("Total Cost: $" + valentinesBouquet.getCost());
  }

}
