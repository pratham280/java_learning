import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        // This program demonstrates how to take input from the user
        Scanner scanner = new Scanner(System.in);
        // Create a Scanner object to read input from the console
        System.out.print("Please enter your roll number: ");
        int rollno = scanner.nextInt();
        // Read an integer input from the console
        System.out.println("Your roll number is: " + rollno);
        scanner.close();
    }
}
