/*-------------------------------------------------------------
// AUTHOR: Connor Ott (modified from Lab3.java file in canvas)
// FILENAME: Lab3.java
// SPECIFICATION: program that which takes 3 user inputs as homework grade, midterm exam grade, and final exam grade. 
// Then uses the a formula to calculate the weighted grade total for the user based on the inputted grades.
// FOR: CSE 110- Lab #3
// TIME SPENT: 1.5 hours
//-----------------------------------------------------------*/

import java.util.Scanner; // importing Scanner 

public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // three variables declared for HW, midterm, and final exam grades
        double HW = 0;
        double midterm = 0;
        double finalexam = 0;
      
        // loop control variable declared
        int i = 0;
        // while statement to ensure i is valid 
        while (i == 0 || i == 1 || i == 2) {
        	// first if else statement to obtain a valid homework grade
        	if (i == 0) {
        		System.out.println("Enter your homework grade: ");
        	    HW = scanner.nextDouble() ;
        		if (HW < 0 || HW > 100) {
        			System.out.println("[ERR] Invalid Input. A homework grade should be in [0, 100].");
                } else {
                    i++;
                }
        }  
        	// second if else statement to obtain a valid midterm grade
        	if (i == 1) {	
                		System.out.println("Enter your midterm exam grade: ");
                	midterm = scanner.nextDouble();
                	if (midterm < 0 || midterm > 100) {
                		System.out.println("[ERR] Invalid Input. A miterm grade should be in [0, 100].");
                	} else {
                		i++;
                	}
        	}
                	// third if else statement to obtain a valid final exam grade
                		if (i == 2) {
                		System.out.println("Enter your final exam grade: ");
                	    finalexam = scanner.nextDouble();
                	    if (finalexam < 0 || finalexam > 200) {
                	    	System.out.println("[ERR] Invalid Input. A final exam grade should be in [0, 200].");
                	    } else {
                	    	i++;
                        }
                     }
        	}
        // defining weighted total with given equation   
        double weighted_total = ((finalexam / 200 * 50) + (midterm * .25) + ( HW * .25))  ;
        // printing student's weighted grade
        System.out.println("[INFO] Student's weighted total is " + weighted_total);
        // fourth if else statement to determine if student has passed or failed, and tell them so
        if (weighted_total >= 50) {
        	System.out.println("The student passed the class");
        } else {
            System.out.println("The student failed the class.");
        }
    }  
    }