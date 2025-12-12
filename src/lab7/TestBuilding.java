package lab7;

public class TestBuilding {

  public static void main(String[] args) {
    
    Room room1 = new Room("guest room",3,40.00);
    Building building1 = new Building("BlueHotel", room1, 50);
    System.out.println("Total area of the building: " + building1.getTotalArea() + " m2");

    Owner[] owners = new Owner[2];
    owners[0] = new Owner("Ali", 123);
    owners[1] = new Owner("Zeynep", 456);

    Building building2 = new Building("HOTEL XYZ", room1, 25, owners);
    System.out.println("Owners of the building:");
    building2.DisplayAllOwners();

    System.out.println(owners[0].getName());
    System.out.println(owners[0].getDate());

    // Call getOwners() and store elements in separate array
    Owner[] buildingOwners = building2.getOwners();
    System.out.println("\nOwners stored in separate array:");
    for (Owner owner : buildingOwners) {
      System.out.println(owner.toString());
    }
    
  }

}
