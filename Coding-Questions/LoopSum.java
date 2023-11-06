// QUESTION 7 ///////////////////////////////////////////////////////////////////////////////////////////////

// Write a program that collects any number of non-negative integer inputs and calculates the sum of the values. 
// A negative integer should end the input collection and is not part of the sum.
 
// Output the smallest non-negative value and the sum of the non-negative input values, ending with a newline.
// Ensure your program output matches the example formatting below and works for a variety of input values.
 
// If the input is:
 
// 15 
// 20 
// 0 
// 3 
// -1 
 
// the output is:
 
// Smallest: 0 
// Sum: 38

import java.util.Scanner;

public class LoopSum {
    public static void main(String[] args) {
        // scanner instance for user input
        Scanner scanner = new Scanner(System.in);
        // set the smallest to be larger than any integer value initially 
        int smallest = Integer.MAX_VALUE;
        // initialize sum 
        int sum = 0;
        // print the prompt to the terminal
        System.out.println("Enter integers: ");

        // while loop runs until a negative number is entered
        while(true) {
            int input = scanner.nextInt();

        // if the input is smaller than 0, break out of the loop
        if (input < 0) {
            break;
            }
        // update sum
        sum = sum + input;
        
        // check to see if it is smaller than the recorded smallest value
        if (input < smallest) {
                smallest = input;
            }
        }
        // after loop closes, print the results to the terminal
        System.out.println("Sum: " + sum + "\nSmallest: " + smallest);
        // close the scanner
        scanner.close();

        }
    }

