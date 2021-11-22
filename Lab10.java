/*-------------------------------------------------------------------------
// AUTHOR: Connor Ott
// FILENAME: Lab10.java
// SPECIFICATION: This program fills the elements of an array by asking the user for input, then sorts the elements and displays them back to the user.
// FOR: CSE 110- Lab #10
// TIME SPENT: 1 hour
//----------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab10
{
    public static void main(String[] args)
    {
       // DECLARING USEFUL VARIABLES
		int arraySize;
    	int temp;
        Scanner scan = new Scanner(System.in);

        // requesting elements of an array from the user, and saving it in the variable arraySize
        System.out.println("How many elements in the array?");
		arraySize = scan.nextInt();
		
		
        // Declare a int array by the size you received above (it is given to you)
        int [] arrayInt = new int[arraySize]; 

        // Filling in the Array
        int numOfElements = -1;
        for (int i = 0; i < arraySize; i++)
        {        
            // Asking the user to give the value for each element of the array
        	System.out.println("Enter next element of the array");
        	// saving each value to the ith element of the array
        	arrayInt[i] = scan.nextInt();
        } 
        // Sorting the array's elements in increasing order
        // This first for loop iterates all elements as element_i
        for (int i = 0; i < arraySize; i++)
        {
            // This second for loop finds the right position of element_i
            for (int j = i + 1; j < arraySize; j++)
            {
                // Comparing the ith value and jth value,
                // And swapping the values if i >= j
            	if (arrayInt[i] >= arrayInt[j]) { 
                     temp = arrayInt[i];
                     arrayInt[i] = arrayInt[j];
                     arrayInt[j] = temp;
            }
        }
        }
        // Displaying the sorted array on the same line  (this is given, no need to change the loop)      
        System.out.println("The array after sorting");

        for (int i = 0; i < arrayInt.length; i++)
        {
            // Printing ith element, NOT including a line break
        	System.out.print(arrayInt[i]);
        	if (i < arrayInt.length - 1) {
        		System.out.print(", ");
        	}

        }
        // Printing a line break
        System.out.println("\n");
        // Removing the minimum in the sorted array
        int offset = 1; // variable offset for usefulness in the loops
        
        // In this for loop, we move the element at i + 1 to the position i  (it is given so need to complete)
        for (int i = 0; i < arrayInt.length - offset; i++)
        {
            // Moving array[i + 1] to array[i]
        	arrayInt[i] = arrayInt[i+1];
        }

        // The last element will be set as zero 
        arrayInt[arrayInt.length-1] = 0;
        // Displaying the Array after removing the first element     
        System.out.println("The array with the minimum removed");        
        for (int i = 0; i < arraySize; i++)
        {
            // Printing ith element, do NOT include line break
        	System.out.print(arrayInt[i]);
            if(i<arraySize-1) { 
            	System.out.print(", ");
            	}
        }
        // Printing a line break
        System.out.println();
        // Searching for an element and remove it
        // Asking the user which element to remove
        int valueToRemove = 0;
        System.out.println("Enter the value to search and remove:");
        // Using the Scanner to get a value for search
        valueToRemove = scan.nextInt();
        // using for and if statements to search for and remove the target value
        boolean isFound = false;
        for (int i = 0; i < arraySize; i++)
        {
            if (arrayInt[i] == valueToRemove) {
            	isFound = true;
            	System.out.println("Search element found");
            	for (int j = i; j < arraySize-1; j++){       	           
            		arrayInt[j] = arrayInt[j+1];
       	        }  	
            	break;
            }                  
        } if (isFound == false) {
        	System.out.println("Search element NOT found");
        }
        // Displaying the final array  (it is given, so no need to change anything here)        
        System.out.println("\nThe final array");      
        for (int i = 0; i < arrayInt.length; i++)
        {
            // Printing ith element, do NOT include line break
        	System.out.print(arrayInt[i]);
        	if (i < arrayInt.length - 1) {
        		System.out.print(", ");
        	}

        }
        // Printing a line break
        System.out.println("\n");  
    }
}