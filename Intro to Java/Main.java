import java.util.Scanner;

//every class in java extends the Object class
// the Object class is the root of the class hierarchy in Java
public class Main{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // prints simple text to the console
        Scanner scanner = new Scanner (System.in);
        // system.in is the standard input stream which corresponds to the keyboard
        // scanner is used to read input from the console
        // scanner object to read input from the console
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        // read a line of text from the console
        System.out.println("Hello, " + name + "!");
        scanner.close();
        // close the scanner to free up resources
        
    }
}