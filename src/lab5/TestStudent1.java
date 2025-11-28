package lab5;

public class TestStudent1 {
    public static void main(String[] args) {
        Student1 student1 = new Student1("Dua Lipa", "Los Angales");
        System.out.println(student1.toString());
        student1.setAddress("Las Vegas");
        System.out.println(student1.getName());
        System.out.println(student1.getAddress());
        student1.addCourse("SENG211", 70);
        student1.addCourse("COME201", 43);
        student1.addCourse("COME205", 88);
        student1.printCourses();
        System.out.println("Average Grade: " + student1.getAverageGrade());        
    }

}
