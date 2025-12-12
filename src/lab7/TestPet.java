package lab7;

public class TestPet {
  public static void main(String[] args) {
    // Initialize a 3 year old male pet
    Pet pet = new Pet("UnnamedPet", 3, true);
    System.out.println("Generic Pet: " + pet.toString());
    
    // Initialize a 3 year old white male dog
    Dog dog = new Dog("", 3, true, "white", "Labrador");
    System.out.println("\nDog before adoption: " + dog.toString());
    
    // Make Peter adopt the dog and name him Lassie
    dog.beAdopted("Peter", "Lassie");
    System.out.println("Dog after adoption: " + dog.toString());
    
    // Print Lassie's name and human age
    System.out.println("\nLassie's name: " + dog.getName());
    System.out.println("Lassie's human age: " + dog.getHumanAge() + " years");
    
    // Make Lassie speak
    System.out.print("\nLassie's sounds:");
    dog.speak();
    
  } 

}
