/*-------------------------------------------------------------
// AUTHOR: Connor Ott (modified from Lab4.java file in canvas
// FILENAME: Lab4.java
// SPECIFICATION: program that can perform different arithmetic operations based on user input
// FOR: CSE 110 - Lab #4
// TIME SPENT: 1.5 hours
//-----------------------------------------------------------*/

// Importing Scanner class
import java.util.Scanner ;

public class Lab4 {

	public static void main(String[] args) {
        // Declaring necessary variables
        int x = 5;
        int option = 1;
        double option_1 = 1;
        int option_2 = 2;
        int option_3 = 3;
        char option_4 = 4;
        double sum_m = 0;
        int factorial_m = 1;
        int leftmost_m = 0;
        int count = 0;
        Scanner scanner_num = new Scanner(System.in);
        do {
        	displayMenu();
       option = scanner_num.nextInt();	
        	// Displaying the menu
            // Ask the user for one option
            // -->
        			switch (option) {
        			case 1 : 
        				System.out.println("Enter a number:");
        				option_1 = scanner_num.nextDouble();
        				sum_m = (option_1 ) * ((option_1 + 1)/2);
        				System.out.println("The sum of numbers 1 to " + option_1 + " is: " + sum_m);
        				break;		
        			case 2 :
        				System.out.println("Enter a number:");
        				option_2 = scanner_num.nextInt();
        				for(int i = 1; i <= option_2; ++i)
        				{
                    // factorial_m = factorial_m * i;
        					factorial_m = (factorial_m * i);
        				}
        				System.out.printf("\nFactorial of %d = %d\n", option_2, factorial_m);
        				break;
        			case 3 :  
        				System.out.println("Enter a number:");
        				option_3 = scanner_num.nextInt();
        				leftmost_m = option_3 ;
        		        while(!(option_3 < 10)) {       		        
        		            option_3 = (option_3)/10;	
        		            if (option_3 < 10) {
        					System.out.println("The leftmost digit is " + option_3 );
        		            } else 
        					option_3++;	
        		            }
        					break;        	
        			case 4 : 
        				System.out.println("Bye");
        				x = 6;
        				break;
        			}}	while (x != 6); { 
        			}
        	
        			 
        	
        }

    /**
     * Printing the display menu
     */
    private static void displayMenu() {
        System.out.println("Please choose one option from the following menu:");
        System.out.println("1) Calculate the sum of integers from 1 to m");
        System.out.println("2) Calculate the factorial of a given number");
        System.out.println("3) Display the leftmost digit of a given number");
        System.out.println("4) Quit");
    }
}