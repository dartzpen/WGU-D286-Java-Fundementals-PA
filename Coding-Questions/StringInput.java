// QUESTION 6 /////////////////////////////////////////////////////////////////////////////////////////////

// Write a program that collects a full name as one string input.
 
// Format and output the name as shown below:
// lastInitial., firstName middleInitial.
 
// If no middle name was provided, format and output the name as shown below:
// lastInitial., firstName
 
// If the input is:
// Pat Silly Doe
 
// the output is:
// D., Pat S.
 
// Alternatively, if the input is:
// Julia Clark
 
// the output is:
// C., Julia

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        // Create scanner instance
        Scanner scanner = new Scanner(System.in);
        String userName = GetInput(scanner);
        // use method to format the name
        FormatName(userName);
        // close scanner
        scanner.close();
        

    }
    // method retreives input from user
    public static String GetInput(Scanner scanner) {
        // user prompt
        System.out.print("Enter full name: ");
        // nextLine() find the entire entry
        String userName = scanner.nextLine();
        return userName;

    }
    // method splits the name into an array, assigns each into a variable and prints the formatted String
    public static void FormatName(String userName) {
        String[] names = userName.split(" ");
        // check if there is a middle initial
        // I am showing variance in the way I am formatting to show that there are multiple options to acheive the desired format
            if(names.length == 3) {
                String firstName = names[0];
                String middleInitial = names[1];
                String lastInitial = names[2].substring(0,1);
                String format = lastInitial +"., " +  firstName + " " +  middleInitial.charAt(0) + ".";
                System.out.println(format);
            }
            // if there is no middle initial 
            if(names.length == 2) {
                String firstName = names[0];
                String lastInitial = names[1].substring(0,1) + "., ";
                System.out.println(lastInitial + firstName);
            }
            // returns if there is not 2 or 3 words
            else {
                System.out.println("Please enter a valid name. Terminating program..");
                return;
        }

    }
}
    
