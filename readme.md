# Java Learning Repository

This repository contains comprehensive Java code examples demonstrating fundamental programming concepts, Object-Oriented Programming (OOP) principles, and various data structures.

## 📚 Table of Contents

1. [Overview](#overview)
2. [Object-Oriented Programming Concepts](#object-oriented-programming-concepts)
3. [Data Structures Demonstration](#data-structures-demonstration)
4. [How to Run](#how-to-run)
5. [Learning Outcomes](#learning-outcomes)

## 📖 Overview

This project serves as a complete learning resource for Java programming, covering two major areas:

- **Object-Oriented Programming (OOP)** - Fundamental principles of modern programming
- **Data Structures** - Essential collections and their practical applications

The code is structured to be educational, with clear examples and detailed comments explaining each concept.

## 🏗️ Object-Oriented Programming Concepts

*Note: The OOP code is currently commented out in the main file but provides excellent examples of the following concepts:*

### 1. **Abstraction**
```java
abstract class Vehicle {
    public abstract void start(); // Abstract method
}
```
- **Purpose**: Hides complex implementation details
- **Implementation**: Abstract classes and methods
- **Example**: `Vehicle` class defines common structure without specific implementation

### 2. **Inheritance**
```java
class Car extends Vehicle {
    // Car inherits from Vehicle
}
```
- **Purpose**: Code reusability and establishing relationships
- **Implementation**: `extends` keyword
- **Examples**: 
  - `Car` inherits from `Vehicle`
  - `Motorcycle` inherits from `Vehicle`

### 3. **Encapsulation**
```java
private int doors; // Private field
public int getDoors() { return doors; } // Public getter
```
- **Purpose**: Data protection and controlled access
- **Implementation**: Private fields with public getter/setter methods
- **Benefits**: Data validation and security

### 4. **Polymorphism**
```java
@Override
public void start() {
    // Different implementation for each vehicle type
}
```
- **Purpose**: Same interface, different behaviors
- **Implementation**: Method overriding with `@Override`
- **Example**: Each vehicle type has its own `start()` method

### 5. **Composition**
```java
class Driver {
    public void drive(Vehicle vehicle) {
        // Driver uses Vehicle objects
    }
}
```
- **Purpose**: "Has-a" relationships between objects
- **Implementation**: Using objects of other classes as instance variables

## 📊 Data Structures Demonstration

The current active code demonstrates 10 essential Java data structures with practical examples:

### 1. **Arrays**
- **Type**: Fixed-size, homogeneous data structure
- **Use Case**: When you know the exact number of elements
- **Features**:
  - 1D and 2D arrays
  - Index-based access
  - Memory efficient

```java
int[] numbers = {10, 20, 30, 40, 50};
int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
```

### 2. **ArrayList**
- **Type**: Dynamic array, resizable
- **Use Case**: When size changes frequently
- **Features**:
  - Automatic resizing
  - Index-based access
  - Supports generics

```java
ArrayList<String> cars = new ArrayList<String>();
cars.add("Tesla");
```

### 3. **LinkedList**
- **Type**: Doubly linked list
- **Use Case**: Frequent insertions/deletions at beginning/end
- **Features**:
  - Efficient insertion/deletion
  - Implements both List and Queue interfaces
  - No random access

```java
LinkedList<String> countries = new LinkedList<String>();
countries.addFirst("Mexico");
```

### 4. **HashMap**
- **Type**: Key-value pairs storage
- **Use Case**: Fast lookups by key
- **Features**:
  - O(1) average lookup time
  - No duplicate keys
  - Unordered

```java
HashMap<String, Integer> ages = new HashMap<String, Integer>();
ages.put("Alice", 25);
```

### 5. **HashSet**
- **Type**: Unique elements collection
- **Use Case**: Eliminating duplicates
- **Features**:
  - No duplicate elements
  - Fast contains() operation
  - Unordered

```java
HashSet<String> colors = new HashSet<String>();
colors.add("Red"); // Duplicates automatically ignored
```

### 6. **Stack**
- **Type**: LIFO (Last In, First Out) structure
- **Use Case**: Function calls, undo operations, expression evaluation
- **Features**:
  - Push/pop operations
  - Peek functionality
  - Extends Vector class

```java
Stack<String> books = new Stack<String>();
books.push("Java Programming");
String topBook = books.pop();
```

### 7. **Queue**
- **Type**: FIFO (First In, First Out) structure
- **Use Case**: Task scheduling, breadth-first search
- **Features**:
  - Offer/poll operations
  - Interface implemented by LinkedList
  - Fair processing order

```java
Queue<String> queue = new LinkedList<String>();
queue.offer("Customer 1");
String served = queue.poll();
```

### 8. **PriorityQueue**
- **Type**: Priority-based queue
- **Use Case**: Task scheduling with priorities, algorithms like Dijkstra's
- **Features**:
  - Elements served by priority
  - Natural ordering (smallest first)
  - Heap-based implementation

```java
PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
pq.offer(30); pq.offer(10); // 10 will be served first
```

### 9. **TreeMap**
- **Type**: Sorted key-value pairs
- **Use Case**: When you need sorted keys with fast lookups
- **Features**:
  - Red-Black tree implementation
  - Sorted by keys
  - O(log n) operations

```java
TreeMap<String, Double> grades = new TreeMap<String, Double>();
grades.put("Alice", 85.5); // Automatically sorted by name
```

### 10. **TreeSet**
- **Type**: Sorted unique elements
- **Use Case**: Maintaining sorted unique collection
- **Features**:
  - Red-Black tree implementation
  - Sorted elements
  - Navigation methods (higher, lower, etc.)

```java
TreeSet<Integer> scores = new TreeSet<Integer>();
scores.add(85); scores.add(92); // Automatically sorted
```

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line or IDE (VS Code, IntelliJ, Eclipse)

### Compilation and Execution

1. **Using Command Line:**
```bash
# Compile the Java file
javac Main.java

# Run the compiled program
java Main
```

2. **Using VS Code:**
- Open the file in VS Code
- Press `F5` or click the "Run" button
- View output in the integrated terminal

### Expected Output
The program will display:
- Detailed demonstrations of each data structure
- Examples of adding, removing, and accessing elements
- Comparisons between different data structures
- Practical use case examples

## 🎯 Learning Outcomes

After studying this code, you will understand:

### **Core Java Concepts**
- ✅ Object-oriented programming principles
- ✅ Class and object creation
- ✅ Method overriding and overloading
- ✅ Access modifiers and encapsulation

### **Data Structure Proficiency**
- ✅ When to use each data structure
- ✅ Time and space complexity considerations
- ✅ Common operations and their efficiency
- ✅ Real-world applications

### **Best Practices**
- ✅ Code organization and structure
- ✅ Proper use of generics
- ✅ Exception handling concepts
- ✅ Clean coding principles

## 💡 Key Takeaways

### **Data Structure Selection Guide**

| Use Case | Recommended Data Structure |
|----------|---------------------------|
| Fixed-size collection | **Array** |
| Dynamic size with frequent access by index | **ArrayList** |
| Frequent insertions at beginning/end | **LinkedList** |
| Fast lookups by key | **HashMap** |
| Unique elements only | **HashSet** |
| LIFO operations | **Stack** |
| FIFO operations | **Queue** |
| Priority-based processing | **PriorityQueue** |
| Sorted key-value pairs | **TreeMap** |
| Sorted unique elements | **TreeSet** |

### **Performance Considerations**

- **ArrayList**: O(1) access, O(n) insertion/deletion
- **LinkedList**: O(n) access, O(1) insertion/deletion at ends
- **HashMap**: O(1) average lookup, insertion, deletion
- **TreeMap/TreeSet**: O(log n) for all operations
- **PriorityQueue**: O(log n) insertion/deletion, O(1) peek

## 📈 Next Steps

To further enhance your Java knowledge:

1. **Practice Problems**: Implement algorithms using these data structures
2. **Design Patterns**: Study common design patterns in Java
3. **Concurrency**: Learn about thread-safe collections
4. **Performance**: Analyze time and space complexity of operations
5. **Real Projects**: Build applications using appropriate data structures

---

*This repository provides a solid foundation for Java programming and data structures. Each example is designed to be educational and practical for real-world development.*