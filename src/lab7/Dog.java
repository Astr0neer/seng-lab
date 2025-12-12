package lab7;

public class Dog extends Pet {
  private String breed;
  private String color;

  Dog(String name, int age, boolean isMale,String color, String breed){
    super(name, age, isMale);
    this.breed = breed;
    this.color = color;
  }

  public String getBreed() {
    return breed;
  }

  public String getColor() {
    return color;
  }

  public void speak(){
    System.out.println("Woof Woof");
  }

  public int getHumanAge(){
    return 7 * this.getAge();
  }
  

}
