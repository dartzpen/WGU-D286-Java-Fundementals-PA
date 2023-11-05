
// QUESTION 2 //

// Write a program that collects two integer inputs and assigns them to the variables starting_num and multiplier.
// Multiply starting_num by multiplier and output the result. Repeat this process two more times, each time multiplying the previous result by multiplier.
// The three product outputs should be separated by a whitespace character, ending with a newline.
// If the input is:
// 2
// 5
// the output when starting_num = 2 is:
// 10 50 250

// import the scanner library for use of System.in for user input
import java.util.Scanner;

public class MultiplyNumbers {
    public static void main(String[] args) {
        // create and instantiate the scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // gather the user input through a prompt, using the GetInput() method
        int starting_num_input = GetInput(scanner, "Enter the starting number: ");
        int multiplier = GetInput(scanner, "Enter the multiplier: ");

        // run the results through the Calculator() method
        int result = Calculator(starting_num_input, multiplier);
        int result2 = Calculator(result, multiplier);
        int result3 = Calculator(result2, multiplier);
        // output the desired String format of results
        System.out.println(result + " " + result2 + " " + result3);

        // close the scanner when done to avoid memory leaks
        scanner.close();
    }
    // GetInput method retreives the user input
    public static int GetInput(Scanner scanner, String prompt) {
        // print the prompt argument
        System.out.print(prompt);
        // gather the int input from the scanner
        int num = scanner.nextInt();
        // return the input 
        return num;
    }
    // Calculator method takes care of the multiplying logic
    public static int Calculator(int starting_num, int multiplier) {
        int result = starting_num * multiplier;
        return result; 
    }
}

