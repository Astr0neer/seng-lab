package lab7;

public class Pet {

  private String name;
  private String owner;
  private int age;
  private boolean isMale;

  Pet(String name, int age, boolean isMale){
    this.name = name;
    this.owner = "";
    this.age = age;
    this.isMale = isMale;
  }
  Pet(int age, boolean isMale){
    this.age = age;
    this.isMale = isMale;
  }

  public String getName() {
    return name;
  }

  public String getOwner() {
    return owner;
  }

  public int getAge() {
    return age;
  }

  public boolean isMale() {
    return isMale;
  }

  public void changeName(String name){
    if(hasOwner()==true){
      this.name = name;
    }
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setMale(boolean male) {
    isMale = male;
  }

  public void beAdopted(String owner, String name){
    this.owner = owner;
    this.name = name;
  }

  protected static boolean isNullorEmpty(String s) {
    if(s == null || s.isEmpty()){
      return true;
    }
    return false;
  }
  protected boolean hasOwner() {
    if(isNullorEmpty(owner) == false){
      return true;
    }
    return false;
  }

  public String toString(){
    String gender = isMale ? "male" : "female";
    return "Pet Name: " + this.name + ", Owner: " + this.owner + ", Age: " + this.age + ", Gender: " + gender;        

  }

}
