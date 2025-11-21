package lab4;

public class Person {
     private int id;
     private String name;
     private int age;
     private  static  int idCounter =100;



    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getIdCounter() {
        return idCounter;
    }
}
