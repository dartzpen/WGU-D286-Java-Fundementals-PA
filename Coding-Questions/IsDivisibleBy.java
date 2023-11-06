// QUESTION 5 /////////////////////////////////////////////////////////////////////////////////////////////////////
// A number is divisible by 3 if the sum of its digits is divisible by 3.
// For example, 153 is divisible by 3 because 1 + 5 + 3 = 9 and 9 is divisible by 3.
 
// Write a program that collects three integer inputs representing the place values of a three-digit number. 
// Determines whether the sum of the digits is divisible by 3. If any integer entered is a negative value, output Invalid input!
 
// Output a formatted message identifying if the three-digit number is divisible by 3, ending with a newline. 
// Ensure your program output matches the example formatting below and works for a variety of input values.
 
// If the input is:
// 1
// 5
// 3
 
// the output is:
// 153 is divisible by 3!
 
// Alternatively, if the input is:
// 1
// 0
// 4
 
// the output is:
// 104 is not divisible by 3!
 
// Alternatively, if the input is:
// 1
// -5
// 3
 
// the output is:
// Invalid input!

import java.util.Scanner;

public class IsDivisibleBy {
    public static void main(String[] args) {
        // create scanner instances
        Scanner digit_1 = new Scanner(System.in);
        Scanner digit_2 = new Scanner(System.in);
        Scanner digit_3 = new Scanner(System.in);
        
        // record user input into variables
        int digit_1_input = GetInput(digit_1);
        int digit_2_input = GetInput(digit_2);
        int digit_3_input = GetInput(digit_3);

        // checks whether inputs are positive
        if(digit_1_input < 0 || digit_2_input < 0 || digit_3_input < 0) {
            String invalid_input = "Invalid input!";
            System.out.print(invalid_input);
            // if any input is not positive, the main method returns
            return;
        }
        // result of adding the numbers 
        int added_nums = digit_1_input + digit_2_input + digit_3_input;
        // formatted number to String 
        String format_numbers = Integer.toString(digit_1_input) + Integer.toString(digit_2_input) + Integer.toString(digit_3_input);

        // call IsDivisible() method on the added numbers
        boolean result = IsDivisible(added_nums);
        if(result == true) {
            String formatted_result_true = (format_numbers + " is divisible by 3!");
            // Print result to the terminal
            System.out.print(formatted_result_true);
        } else {
            // Print result to the terminal
            String formatted_result_false = (format_numbers + " is not divisible by 3!");
            System.out.println(formatted_result_false);
        }
        // close the scanners 
        digit_1.close();
        digit_2.close();
        digit_3.close();
    }
    // Method gets input from user
    public static int GetInput(Scanner scanner) {
        // prompt
        System.out.print("Enter number: ");
        return scanner.nextInt();
    }
    // Method checks if added numbers is divisible by 3
    public static boolean IsDivisible(int added_nums) {
        if ((added_nums % 3) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
