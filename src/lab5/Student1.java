package lab5;

import lab3.Student;

public class Student1 {
    private String name;
    private String address;
    private String courses[];
    private int grades[];
    private int numberOfCourses =0;
    private static int studentIdCounter = 1000;
    public final int MAX_COURSES = 30;
    public final int studentId = studentIdCounter++;

    Student1(){
        name = "--";
        address = "--";
        
    }

    Student1(String name, String adress){
        this.name = name;
        this.address = address;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
        numberOfCourses = 0;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Student1 [name=" + name + ", address=" + address + "]";
    }
    public void addCourse(String course, int grade){
        courses[numberOfCourses] = course;
        grades[numberOfCourses] = grade;
        numberOfCourses++;
    }
    public void printCourses(){
        for(int i = 0; i < numberOfCourses; i++){
            System.out.println(courses[i] + " " + grades[i]);
        }
    }
    public double getAverageGrade(){
        int totalGrade = 0;
        for(int i = 0; i < numberOfCourses; i++){
            totalGrade += grades[i];
        }
        return totalGrade / numberOfCourses;
    }
    
    
}
