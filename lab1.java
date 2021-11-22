/*------------------------------------------------------------
// Author: Connor Ott
// File: Lab1.java
// Specification: This file gives the average of 3 test scores
// FOR: CSE 110-Lab #1
// TIME SPENT: 2 hours
 * //-----------------------------------------------------------*/

import java.util.Scanner;

public class lab1 
{
	public static void main(String[] args) 
	{
		int test1;
		int test2;
		int test3;
		final int NUM_TESTS = 3;
		
		Scanner testscoreinput = new Scanner(System.in);
		
		System.out.println("Enter the score on the first test:"); // prompt
		test1 = testscoreinput.nextInt();  // read in the next integer
		System.out.println("Your test 1 score is " + test1);
		
		System.out.println("Enter the score on the second test:");  // prompt
		test2 = testscoreinput.nextInt();  // read in the next integer
		System.out.println("Your test 2 score is " + test2);
		
		System.out.println("Enter the score on the third test:");  // prompt
		// --> once user enters third test score, the average will be calculated
		test3 = testscoreinput.nextInt();
		
		double avg;
		avg = (test1 + test2 + test3) / (double) NUM_TESTS;
		System.out.println("Your average test score is: " + avg);
	}
}
		