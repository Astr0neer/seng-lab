package lab6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Homework {

  protected LocalDateTime dueDate;
  protected String courseName;
  protected String description;

  private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

  Homework(String courseName, String description, LocalDateTime date) {
       this.dueDate = (date != null) ? date : LocalDateTime.now();
       this.courseName = courseName;
       this.description = description;
   }

  Homework(String courseName, String description) {
       this(courseName, description, LocalDateTime.now());
  }

   public String getFormattedDueDate(){
    return dueDate.format(DATE_FORMATTER);
   }
   

    void displayInfo(){
        System.out.println("Course: " + this.courseName + ", Description: " + this.description + ", Due Date: " + getFormattedDueDate());
    }

}
