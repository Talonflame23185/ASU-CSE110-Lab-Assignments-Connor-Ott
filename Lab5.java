/*-------------------------------------------------------------
// AUTHOR: Connor Ott (modified from Lab5.java file in canvas)
// FILENAME: Lab5.java
// SPECIFICATION: Designing patterns with loops
// FOR: CSE 110 - Lab 5 (Lab in COOR L-38 on WED from 11:15-12:00)
// TIME SPENT: 2 hours
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        final char SIDE_SYMB = '-';
        final char MID_SYMB = '*';
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        char choice = ' ';
        int numSymbols = -1, sideWidth = -1, midWidth = -1;

        do {
            displayMenu();
            inputStr = scanner.nextLine();
            if (inputStr.length() > 0) {
                choice = inputStr.charAt(0);
            }

            switch (choice) {
            case 'r':
                System.out.println("Width of the sides?");
                sideWidth = scanner.nextInt();
                System.out.println("Width of the middle?");
                midWidth = scanner.nextInt();
                scanner.nextLine();  // Flush junk newline symbols

                System.out.println();
                System.out.println(buildRow(SIDE_SYMB, sideWidth, MID_SYMB, midWidth));

                break;
            case 'p':
                System.out.println("Number of symbols on the lowest layer?");
                numSymbols = scanner.nextInt(); 
                scanner.nextLine();  // Flush junk newline symbols

                System.out.println();
                System.out.println(buildPyramid(SIDE_SYMB, MID_SYMB, numSymbols));

                break;
            case 'd':
                System.out.println("Number of symbols on the middle layer?");
                numSymbols = scanner.nextInt();
                scanner.nextLine();  // Flush junk newline symbols

                System.out.println();
                

                break;
            case 'q':
                System.out.println("Bye");
                break;
                
            default:
                System.out.println("Please choose a valid option from the menu.");
                break;
            }
            System.out.println();
        } while (choice != 'q');
        
        scanner.close();
    }
    
    
    /**
     * Build a row of symbols (pattern) with the given parameters. 
     *
     * For example, -----*****----- can be built by the parameters
     *
     * sideWidth = 5, midWidth = 5, sideSymb = '-', midSymb = '*'
     * 
     * @param sideSymb  A char to be repeated on both sides
     * @param sideWidth Number of symbols on each side
     * @param midSymb   A char to be repeated in the middle
     * @param midWidth  Number of symbols in the middle
     * @return          A String of a row of the designed pattern
     */
    private static String buildRow(
        char sideSymb, int sideWidth, char midSymb, int midWidth) {

        String result = ""; // setting initial result to nothing
        String side_Symb = String.valueOf(sideSymb); 
        String mid_Symb = String.valueOf(midSymb); 
        int i = 0; // declaring a variable for the for loop
        String total_Side = ""; // setting initial side value to nothing
        if (sideWidth > 0) { // if statement with a for loop to get the amount of side symbols
            for (i = 0; i < sideWidth; i++) {
                total_Side = total_Side + side_Symb;          
                }
        }
        i = 0; // declaring a variable for the for loop
        String total_Mid = ""; // setting the initial middle value to nothing 	
        for (i = 0; i < midWidth; i++) { // for loop to get the amount of middle symbols
            total_Mid = total_Mid + mid_Symb;
        }
        result = (total_Side + total_Mid + total_Side); // combining side and middle symbols
        return result; // returning the result
        }
      // End of buildRow

    private static String buildPyramid(
        char sideSymb, char midSymb, int numSymbols) {

        String result = "";
        int sideWidth = -1, midWidth = -1;
        // declaring variables for loops
        int i = 0;
        int j;
        if (numSymbols == 0) {
        	return result; // returning nothing if user enters the number 0 
        }
        	else if (numSymbols % 2 == 0) {
        		numSymbols = numSymbols - 1; // decreasing numSymbols by one if user enters odd number
        		int numSymb= numSymbols; // declaring an integer for the bottom row * count
                numSymb=numSymb/2+1; // making numSymb decrease with each line
                for(i=1;i<=numSymb;i++) { // for loop to get the correct amount of - on the left side of the pyramid rows
                    for(j=numSymb-i-1;j>=0;j--) {
                        System.out.print("-"); 
                    }
                    // two for loops to get the correct amount of * in the middle of the pyramid rows
                    for(j=0;j<i-1;j++) { 
                        System.out.print("*");
                    }
                    System.out.print("*");
                    for(j=0;j<i-1;j++) {
                        System.out.print("*");
                    }
                    for(j=numSymb-i-1;j>=0;j--) { // for loop to get the correct amount of - on the right side of the pyramid rows
                        System.out.print("-");
                    }
                    System.out.print("\n"); // printing new lines for the pyramid
                }
        	}
        	else if (numSymbols % 2 != 0) {
        		int numSymb= numSymbols; // declaring an integer for the bottom row * count
                numSymb=numSymb/2+1; // making numSymb decrease with each line
                for(i=1;i<=numSymb;i++) { // for loop to get the correct amount of - on the left side of the pyramid r
                    for(j=numSymb-i-1;j>=0;j--) {
                        System.out.print("-");
                    }
                 // two for loops to get the correct amount of * in the middle of the pyramid rows
                    for(j=0;j<i-1;j++) {
                        System.out.print("*");
                    }
                    System.out.print("*");
                    for(j=0;j<i-1;j++) {
                        System.out.print("*");
                    }
                    for(j=numSymb-i-1;j>=0;j--) { // for loop to get the correct amount of - on the right side of the pyramid rows
                        System.out.print("-");
                    }
                    System.out.print("\n"); // printing new lines for the pyramid
                }
        	}
		return result;
    }

    
    /**
     * Build a diamond pattern. The parameters are the same 
     * as {@link #buildPyramid(char, char, int)}.
     * 
     * @param  sideSymb  A char to be repeated on both sides
     * @param  midSymb   A char to be repeated in the middle
     * @param  numSymbols The height of a pyramid
     * @return           A String of the inverted diamond pattern.
     */
    
    // did not attempt buildDiamond
    
    /**
     * Display the menu
     */
    private static void displayMenu() {
        System.out.println("Please choose one pattern from the list:");
        System.out.println("r) Row");
        System.out.println("p) Pyramid");
        System.out.println("d) Shallow diamond");
        System.out.println("q) Quit");
      // End of displayMenu
}
}   
  // End of Lab5