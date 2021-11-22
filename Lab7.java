/*---------------------------------------------------------
// AUTHOR: Connor Ott (modified from Lab7.java in canvas)
// FILENAME: Lab7.java
// SPECIFICATION: your own description of the program.
// FOR: CSE 110 - Lab #7
// TIME SPENT: 1.5 hours
//-------------------------------------------------------*/

import java.util.Scanner;

public class Lab7
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // creating a scanner to read user input

        System.out.println("How many students do you have?"); // Asking the user for the number of students 
        int numStudents = scanner.nextInt(); // saving the number of students to numStudents

        /* Creating two arrays: one for groups the other for grades */
        int[] studentGroups = new int[numStudents];
        double[] studentGrades = new double[numStudents];
        
        for (int i = 0; i < numStudents; i++) // for loop to print the correct amount of entries
        {
        	System.out.println("[Group #] and [Grade] for Entry " + i);        	
        	studentGroups[i] = scanner.nextInt();
        	studentGrades[i] = scanner.nextInt();
        } 

        /* Printing out the content of the two arrays as a list (from the back). */
        System.out.println("\n===== List of Student Records =====");
        int records = 0;
        for (records = numStudents-1; records>=0; records--) { // for loops to print the correct amount of student records
        	System.out.println(" Group " + studentGroups[records] + " - " + studentGrades[records] + "0 Points");
        }

        /* Print some statistics for each group. You must use the method "printStats" */
        System.out.println("\n===== Group Statistics =====");
        for (int j = 0; j < findTotalNumOfGroups(studentGroups); j++)
        {
            printStats(studentGroups, studentGrades, j + 1);
        }

        /* Clean up */
        scanner.close();
    }
    /**
     * Print out the count and average for targetGroup.
     * 
     * @param groups      an array of all students' groups
     * @param grades      an array of all students' grades
     * @param targetGroup the target group
     */
    private static void printStats(int[] groups, double[] grades, int targetGroup)
    {
        int count = 0;
        double sum = 0;
        double average = 0;
        /* For each record in groups */
        for (int k = 0; k < groups.length; k++) // for statement to get each record in groups
        {
            /* If we find a record matching targetGroup, update count and sum */
            if (groups[k] == targetGroup) { // if statement to update count and sum for group and grades
            	count ++;
                sum += grades[k];
            }
        }

        /* Updating the average */
        
        average = sum/(double)count;

        /* Outputting the statistics */
        System.out.printf("Group #%d has %d student(s), the average is %.2f\n", targetGroup, count, average);
    }

    /**
     * Find out the total number of groups on record. Group numbers are assumed to
     * be a cumulative sequence starting from 1, e.g., [1, 2, 3, 4, 5]. Therefore,
     * the total number of groups is simply the maximum number on a record (array)
     * of group numbers.
     * 
     * @param groups an array of group numbers
     * @return the total number of groups on the record
     */
    private static int findTotalNumOfGroups(int[] groups)
    {
        if (groups == null)
        {
            return 0;
        }

        int numGroups = 0;
        for (int l = 0; l < groups.length; l++)
        {
            if (groups[l] > numGroups)
            {
                numGroups = groups[l];
            }
        }
        return numGroups;
    }

}