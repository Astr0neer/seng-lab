package lab6;

public class Bouquet {
  private String theme;
  private int numberOfFlowers;
  private Flower flower;

  Bouquet(String theme, int numberOfFlowers, Flower flower) {
    this.theme = theme;
    this.numberOfFlowers = numberOfFlowers;
    this.flower = flower;
  }
  public String getTheme() {
    return theme;
  }

  public int getNumberOfFlowers() {
    return numberOfFlowers;
  }

  public Flower getFlower() {
    return flower;
}
  public void setTheme(String theme) {
    this.theme = theme;
  }

  public void setNumberOfFlowers(int numberOfFlowers) {
    this.numberOfFlowers = numberOfFlowers;
  }

  public void setFlower(Flower flower) {
    this.flower = flower;
  }

  double getCost(){
    return numberOfFlowers * flower.getUnitPrice();
  }

}

