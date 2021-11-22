/*-------------------------------------------------------------
//AUTHOR: Connor Ott
//FILENAME: Lab11.java
//SPECIFICATION: Program that prints an accurate calendar depending on the month and year entered.
//FOR: CSE 110 - Lab #11
//TIME SPENT: 30 minutes
//-----------------------------------------------------------*/

import java.time.LocalDate;
import java.util.Scanner;

public class Lab11
{
    public static void main(String[] args)
    {
        final int NUM_WEEKS = 6;
        final int NUM_DAYS = 7;
        
        Scanner scan = new Scanner(System.in);

        /* Ask the user for month/year */
        System.out.println("Which month/year would you like to look up the calendar?\n(ex. 11 2020)");
        int month = scan.nextInt(), day = 1, year = scan.nextInt();

        int numOfDays = getNumOfDays(month, year);  // the number of days
        int firstWeekday = getFirstWeekday(month, day, year);  // the first weekday
        /* Create a 2D array with enough space for at least 6 weeks by 7 days */
        String[][] calendar = new String[NUM_WEEKS][NUM_DAYS];

        /* Initialize the content of calendar by "-" */

        for(int i=0;i < NUM_WEEKS; i++) {
        	for(int j=0;j < NUM_DAYS;j++) {
        		calendar[i][j] = "-";
        	}
        }

        /*
         * Fill in the 2D array by the calendar in the given month/year. You need to align
         * weekdays with indices in your 2D array. The first index of a row of week is
         * Sunday and the last is Saturday.
         */
        int weekday=1;
        System.out.println(firstWeekday);
        
        for(int i = firstWeekday-1;i <= (7-firstWeekday) + firstWeekday-1; i++) {
        	calendar[0][i] = String.valueOf(weekday);
        	weekday++;
        }
        for(int i = 1; i< NUM_WEEKS; i++) {
        	for(int j = 0; j < NUM_DAYS; j++) {
        		if (weekday > numOfDays) {
	        		break;
	        	}
	        	calendar[i][j] = String.valueOf(weekday);
	        	weekday++;
	        	
        	}
        }

        /**
         * Print out the calendar
         */
        System.out.println();
        System.out.printf("     The Calendar for %2d/%4d\n", month, year);
        System.out.printf("-----------------------------\n");
        System.out.printf("  Su  Mo  Tu  We  Th  Fr  Sa\n");
        for (int i = 0; i < NUM_WEEKS; i++)
        {
            for (int j = 0; j < NUM_DAYS; j++)
            {
                System.out.printf("%4s", calendar[i][j]);
            }
            System.out.println();
        }

        scan.close();
    }

    /**
     * Get the weekday of a given date. This method follow the convention in the US
     * where the week begins with Sunday.
     * 
     * @param date
     * @return the weekday of date in integer (1 is Sunday, 7 is Saturday)
     */
    private static int getFirstWeekday(int month, int day, int year)
    {
        LocalDate date = LocalDate.of(year, month, day); // ISO
        int val = date.getDayOfWeek().getValue() + 1;
        return val == 8 ? val - 7 : val;
    }

    /**
     * Get the length of a given month in year.
     * 
     * @param month
     * @param year
     * @return the length of month in year
     */
    private static int getNumOfDays(int month, int year)
    {
        return LocalDate.of(year, month, 1).lengthOfMonth();
    }
}