// QUESTION 1 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Write a program that outputs the pattern shown below, ending with a newline. Each line of the pattern contains 5 characters including whitespace.
// The output is:

// H   H
// H   H
// HHHHH
// H   H
// H   H

import java.util.Scanner;

// Scalable version 
public class OutputPattern {
    public static void main(String[] args) {
        // scanner to gather user input
        Scanner scanner = new Scanner(System.in);

        // call the GetInput() method with the scanner and desired prompt 
        String result = GetInput(scanner, "Enter a character: ");
        // call the CreatePattern() method to acheive desired output
        String pattern = CreatePattern(result);
        // print the pattern to the terminal
        System.out.println(pattern);
        // close the scanner
        scanner.close();
    }
    // method to retrieve user input
    public static String GetInput(Scanner scanner, String prompt) {
        // Print the prompt in the terminal 
        System.out.print(prompt);
        // Store the userInput in a variable
        String userInput = scanner.nextLine();
        // return the user input 
        return userInput;
    }
    // method to create the pattern
    public static String CreatePattern(String userInput) {
        // use the StringBuilder function to create an pattern object
        StringBuilder pattern = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            // accounts for the horizontal line at the index of 2
            if(i == 2) {
                    pattern.append(userInput.repeat(5));
                    pattern.append("\n");
            } else {
                pattern.append(userInput + " ".repeat(3) + userInput);
                pattern.append("\n");
            }
        }
        return pattern.toString();
    }
}

// Hard code version for one use

// public class OutputPattern {
//     public static void main(String[] args) {
//         for(int i = 0; i < 5; ++i) {
//             if (i == 2) {
//    
//                 String result = "HHHHH";
//                 System.out.println(result);
//             } else {
//                 System.out.println("H   H");
//             }
//         }
//     }
// }


