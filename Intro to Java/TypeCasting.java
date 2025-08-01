

public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting (widening)
        int num = 100;
        double d = num;  // int to double
        System.out.println("Implicit casting (int to double): " + d);

        // Explicit casting (narrowing)
        double pi = 3.14;
        int intPi = (int) pi;  // double to int
        System.out.println("Explicit casting (double to int): " + intPi);

        
    }
}
