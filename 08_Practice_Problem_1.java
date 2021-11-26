/*Java program to input electricity unit charge and calculate the total electricity bill 
according to the given condition:
	For first 50 units Rs. 0.50/unit
	For next 100 units Rs. 0.75/unit
	For next 100 units Rs. 1.20/unit
	For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill*/

package extc1;
import java.util.Scanner;

public class light
{ 
	public static void main(String[] args) {
		int unit;
	    double amount, totalamount, charge;
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the total number of units you consumed : ");
	    unit = sc.nextInt();
	    
	    if(unit <= 50) {
	    	amount = unit * 0.50;
	    	}
	    else if (unit <= 150) {
	    	amount= 25 + ((unit - 50) * 0.75);
	    	}
	    else if (unit <= 250) {
	    	amount= 100 + ((unit - 15) * 1.20);
	    	}
	    else {
	    	amount= 220 + ((unit - 250) * 1.50);
	    	}
	    
	    charge= amount* 0.20;
	    totalamount= amount+charge;
	    totalamount = amount + charge;
		System.out.println("\nYour Electricity Bill  =  " + totalamount);
	 }
}
