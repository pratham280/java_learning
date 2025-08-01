// This file is part of the "Intro to Java" course.
// anything which starts with a lowercase is a primitive data type
// primitive data types are the most basic data types in Java
public class Primitives {
    public static void main(String[] args) {
        int age = 25; // 4 bytes
        char letter = 'r'; // 2 bytes
        float marks = 99.6f; // 'f' is used to denote a float literal
        double largeDecimalNumbers = 44556643.4343; // 8 bytes
        long largeInteger = 3434343434343L; // 'L' is used to denote a long literal
        boolean isJavaFun = true; // 1 bit
        System.out.println("Age: " + age);
        System.out.println("Letter: " + letter);
        System.out.println("Marks: " + marks);
        System.out.println("Large Decimal Number: " + largeDecimalNumbers);
        System.out.println("Large Integer: " + largeInteger);
        System.out.println("Is Java Fun? " + isJavaFun);
    }
}
