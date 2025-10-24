package lab3;

public class Student {
    String name;
    int age;
    boolean isJunior;
    char gender;

    Student(String name, int age, boolean isJunior, char gender){
        this.name =name;
        this.age = age;
        this.isJunior =isJunior;
        this.gender=gender;

    }
    Student(){
        String name = "--";
        int age = 0;
        boolean isJunior = false;
        char gender = 'M';
    }

    void displayInfo(){
        System.out.println(this.name + " "+  this.age+ " " + this.isJunior + " " + gender);
    }
}
