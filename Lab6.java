/*-------------------------------------------------------------
//AUTHOR: Connor Ott (modified from Lab6.java in canvas)
//FILENAME: Lab6.java
//SPECIFICATION: your own description of the program.
//FOR: CSE 110 - Lab #6 (Lab Time W 11:15-12:00)
//TIME SPENT: 2 hours
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab6
{
    public static void main(String[] args)
    {
        // declaring important variables
        Scanner scan = new Scanner(System.in);
        double rpLaptop = -1;
        double rpPhone = -1;
        double rpBackpack = -1;
        // using a function to read the retail price of different items
        rpLaptop = readRetailPrice("laptop",scan);
        rpPhone = readRetailPrice("mobile phone",scan);
        rpBackpack = readRetailPrice("backpack",scan);
       
        // Computing after-tax prices in one state and comparing with those in AZ 
        System.out.println("Enter one state you'd like to compare after-tax prices: ");
        String targetState = scan.next();
        double targetStateTax = getSalesTaxRate(targetState);
        // Computing the after-tax prices 
        double afterTaxAZ = addTax(rpLaptop) + addTax(rpPhone) + addTax(rpBackpack);
        double afterTaxTarget = addTax(rpLaptop, targetStateTax) + addTax(rpPhone, targetStateTax)
                + addTax(rpBackpack, targetStateTax);
        double diff = afterTaxAZ - afterTaxTarget;
        // Showing the user the total after-tax prices of their stuff in AZ and the other state they selected
        System.out.println();
        System.out.printf("The total after-tax price in AZ: %.2f\n", afterTaxAZ);
        System.out.printf("The total after-tax price in %s: %.2f\n", targetState, afterTaxTarget);

        // if statement that determines if the user can save money in the selected state, and if so shows them how much they can save
        if (diff > 0)
        {
            System.out.printf("You may save %.2f for those things in %s.\n", diff, targetState);
        }

        scan.close();
    }

    // readRetailPrice method that asks the user for the price of the items and makes sure the price they entered isn't a negative number
    private static double readRetailPrice(String name, Scanner scan)
    {
    	double retailPrice = -1;
    	int i = 1;
    	while (i<=4) {
    	System.out.printf("What is the retail price of your %s? \n", name);
    	retailPrice = scan.nextDouble();
    	if (retailPrice < 0) {
    		System.out.println("[ERR] a price must be non-negative. Please type it again.");
    	}
    	else if (retailPrice > 0) {
    		i += 4;
    	}
    	}
    	return retailPrice;
    }

    // addTax method that returns the price of the item after tax in AZ
    private static double addTax(double price)
    {
        return price = price * getSalesTaxRate("AZ")/100 + price;
    }

    // overloading addTax method to also return the price of the item after tax in selected state
    private static double addTax(double price, double rate)
    {
        return price = price * (rate/100) + price;
    }

    // getsSalesTaxRate method that gets the sales tax (in percent) for the chosen states
    private static double getSalesTaxRate(String state)
    {
        double SALES_TAX_AZ = 8.40;
        double SALES_TAX_CA = 8.66;
        double SALES_TAX_NV = 8.32;
        double SALES_TAX_UT = 7.18;
        double SALES_TAX_CO = 7.65;
        double SALES_TAX_NM = 7.82;
        double SALES_TAX_OR = 0.00;

        double rt = 0;
        switch (state)
        {
        case "AZ":
            rt = SALES_TAX_AZ;
            break;
        case "CA":
            rt = SALES_TAX_CA;
            break;
        case "NV":
            rt = SALES_TAX_NV;
            break;
        case "UT":
            rt = SALES_TAX_UT;
            break;
        case "CO":
            rt = SALES_TAX_CO;
            break;
        case "NM":
            rt = SALES_TAX_NM;
            break;
        case "OR":
            rt = SALES_TAX_OR;
            break;
        default:
            System.out.println("[WARN] The current database does not have sales tax info for " + state + ". Set to 0");
        }

        return rt;
    } // closing main method
} // closing public class Lab6