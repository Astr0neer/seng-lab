package lab6;

public class TestHomework {
  public static void main(String[] args) {

    Homework hw = new Homework("SENG211", "OOP", java.time.LocalDateTime.of(2024, 6, 30, 23, 59));

    hw.displayInfo();
  }

}
