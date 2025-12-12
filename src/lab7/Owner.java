package lab7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Owner {

  private String name;
  private int phoneNumber;
  private LocalDateTime date;
  private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

  Owner(String name, int phoneNumber){
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.date = LocalDateTime.now();
  }
  public String getName() {
    return name;
  } 
  public int getPhoneNumber() {
    return phoneNumber;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public LocalDateTime getDate() {
    return date;
  }
  public void setDate(LocalDateTime date) {
    this.date = date;
  }
  public String getFormattedDate() {
    return date.format(DATE_FORMATTER);
  }
  @Override
  public String toString(){
    return "Owner Name: " + this.name + ", Phone Number: " + this.phoneNumber + ", Date: " + getFormattedDate();
  }

}
