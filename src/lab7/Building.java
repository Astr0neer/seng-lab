package lab7;

public class Building {
  private String name;
  private Room roomType;
  private int numberOfRooms;
  private Owner[] owners;

  public Building(String name, Room roomType, int numberOfRooms) {
    this.name = name;
    this.roomType = roomType;
    this.numberOfRooms = numberOfRooms;
  }
  public Building(String name, Room roomType, int numberOfRooms, Owner[] owners) {
    this.name = name;
    this.roomType = roomType;
    this.numberOfRooms = numberOfRooms;
    this.owners = owners;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Room getRoomType() {
    return roomType;
  }
  public void setRoomType(Room roomType) {
    this.roomType = roomType; 
    }

  public int getNumberOfRooms() {
    return numberOfRooms;
  }
  public void setNumberOfRooms(int numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
  }
  public Owner[] getOwners() {
    return owners;
  }
  public void setOwners(Owner[] owners) {
    this.owners = owners;
  } 

  public double getTotalArea(){
    return this.roomType.getSizeM2() * this.numberOfRooms;
  }

  public void DisplayAllOwners(){
    for(Owner owner : owners){
      System.out.println(owner.toString());
    }

    }
   

}
