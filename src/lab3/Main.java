package lab3;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ayşe",15,true,'F');
        Student student2 = new Student();

        student1.displayInfo();
        student2.displayInfo();
    }
}
