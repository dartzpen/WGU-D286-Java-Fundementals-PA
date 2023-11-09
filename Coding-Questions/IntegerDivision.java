// QUESTION 3 //////////////////////////////////////////////////////////////////////////////////////////////////////////


// Write a program that calculates the number of full tables for a wedding event, based on the number of expected guests.
// Each full table will seat 10 wedding guests.
// Collect one integer input and assign it to the variable guests. Using integer division, calculate the total number of tables that will be filled. 
// The variable tableSize has been declared and initialized and the variables guests and tablesFilled have been declared in the template code.
// Output the number of tables filled, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.

// If the input is:
// 340
// the output is:
// Tables filled: 34

// Alternatively, if the input is:
// 349
// the output is:
// Tables filled: 34

import java.util.Scanner;

public class IntegerDivision {
    public static void main(String[] args) {
        // create scanner object to retrieve user input
        Scanner scanner = new Scanner(System.in);
        // declare tableSize variable
        final int tableSize = 10;
        // use the method GetInput to retreive the user input and store it into the variable 'guests'
        int guests = GetInput(scanner, "Please enter the number of guests: ");
        // use the Calculator method to find the number of filled tables
        int result = Calculator(guests, tableSize);
        // print the result in the terminal 
        System.out.println("Tables filled: " + result);
    }
    // method that retrieves the user input integer
    public static int GetInput(Scanner scanner, String prompt) {
        // print the prompt in the terminal 
        System.out.print(prompt);
        // put the scanner result in the guests variable
        int guests = scanner.nextInt();

        return guests;
    }
    public static int Calculator(int guests, int tableSize) {
        // find the number of tables filled by integer dividing input guests / tableSize (10)
        int tablesFiled = guests / tableSize;
        return tablesFiled;
    }
}
