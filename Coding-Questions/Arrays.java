// QUESTION 8 /////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program that creates an array to hold three values of type double. 
//The program should collect the three double values as input and store them in the array.
// Then calculate the average value of the array.
 
// Output the array values and calculated average value, ending with a newline. 
// Ensure your program output matches the example formatting below and works for a variety of input values.
 
// If the input is:
// 10.0
// 10.5
// 11.0
 
// the output is:
// Array items: 10.0, 10.5, 11.0
// Average: 10.5

import java.util.Scanner;

public class Arrays {
    // array that holds 3 double values
    public static void main(String[] args) {
    // create array with a length of 3
    double[] array = new double[3];
    // initialize scanner 
    Scanner scanner = new Scanner(System.in);
    // retrieve inputs for array
    array[0] = GetInput(scanner);
    array[1] = GetInput(scanner);
    array[2] = GetInput(scanner);

    scanner.close();
    // retreive the average
    double result = FindAverage(array[0], array[1], array[2]);
    // print the results
    System.out.println("Array items: " + array[0] + ", " + array[1] + ", " + array[2]);
    System.out.println("Average: " + result);
}
// uses the scanner to retrieve the user input 
public static double GetInput(Scanner scanner) {
    System.out.print("Enter double: ");
    double input = scanner.nextDouble();
    return input;
}
// method that calculates the average of the 3 doubles
public static double FindAverage(double input0, double input1, double input2) {
    double added = input0 + input1 + input2;
    double average = added / 3;
    return average;
}
}
