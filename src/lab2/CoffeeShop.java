package lab2;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the shop!");
        System.out.println("Here is the menu: Americano/Cappucino/Latte/Espresso");
        System.out.println("Choose from (A-C-L-E): ");
        String choice = scanner.next();

        switch (choice){
            case "A" -> System.out.println("Americano 3.00£");
            case "C" -> System.out.println("Cappucino 3.75£");
            case "L" -> System.out.println("Latte 4.00£");
            case "E" -> System.out.println("Espresso 2.50£");
            default -> System.out.println("Invalid");
        }
        scanner.close();
    }
}
