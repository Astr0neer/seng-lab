import java.util.Scanner;

public class CheckPrime {

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {

                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to check: ");


        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();


            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }


        scanner.close();
    }
}
