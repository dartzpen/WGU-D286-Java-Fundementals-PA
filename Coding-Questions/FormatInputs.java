// QUESTION 4 ///////////////////////////////////////////////////////////////////////////////////

// Write a program that takes a full name, age, and salary as inputs on separate lines. 
// Output a formatted message containing the inputs, ending with a newline. 
// Ensure your program output matches the example formatting below and works for a variety of input values.

// If the input is:
// Pat Ford
// 35
// 60,000

// the output is:
// Pat Ford is 35 and makes $60,000.

import java.util.Scanner;
import java.text.NumberFormat;

class FormatInputs {
    public static void main(String[] args) {
        // creation of scanners for each input 
        Scanner age_scanner = new Scanner(System.in);
        Scanner name_scanner = new Scanner(System.in);
        Scanner salary_scanner = new Scanner(System.in);

        // retrieval of scanner input 
        String name_input = GetName(name_scanner);
        int age_input = GetAge(age_scanner);
        int salary_input = GetSalary(salary_scanner);

        // formatted salary 
        String formatted_salary = SalaryFormat(salary_input);

        // formatted string that prints in the terminal
        System.out.print(name_input + " is " + age_input + " and makes " + formatted_salary);

    }
    // method that retrieves input from the user
    public static int GetAge(Scanner scanner) {
        // age prompt
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        return age;
    }
    public static String GetName(Scanner scanner) {
        // name prompt
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        return name;
    }
    public static int GetSalary(Scanner scanner) {
        // salary prompt
        System.out.print("Enter Salary: ");
        int salary = scanner.nextInt();
        return salary;
    }
    // this part is not neccessary, you can simply format the string itself in the main class. I wanted to account for no comma in the input
    public static String SalaryFormat(int salary) {
        // NumberFormat instance
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        // set decimals to 0 
        currencyFormat.setMaximumFractionDigits(0);
        // format the salary
        String formattedMoney = currencyFormat.format(salary);
        return formattedMoney;
    }
}

