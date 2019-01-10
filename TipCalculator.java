import java.util.*;
import java.math.*;

public class TipCalculator 
{
	static double bill;
	public static void main(String[] args)
	{
		System.out.println("TIP CALCULATOR!");
		System.out.print("Enter the amount for the bill you are paying: ");
		calculateBill();
		
		
	}
	
	public static void calculateBill()
	{
		Scanner input = new Scanner(System.in);
		double total = input.nextDouble();
		System.out.println("What percent of your bill would you like to tip? ( 0-100 (: )");
		Scanner percent = new Scanner(System.in);
		double tip = percent.nextDouble();
		bill=(total + ((tip/100)*total));
		System.out.println("Your total including a " + tip + "% tip is $" + bill);
		System.out.println("Would you like to split your bill? Enter 0 for no or 1 for yes.");
		Scanner split = new Scanner(System.in);
		int answer = split.nextInt();
		if(answer==1)
		{
			splitBill();
		}
		else
		{
			System.out.println("Okay, thank you for calculating!");
		}

	}
	public static void splitBill()
	{
		System.out.println("How many ways would you like to split your bill?");
		Scanner bananaSplit = new Scanner(System.in);
		int numWays = bananaSplit.nextInt();
		double divBill = (bill/numWays);
		System.out.println("Each of the " + numWays + " people will pay $" + divBill);
		System.out.println("Thank you for using the Tip Calculator!");
	}
			
}
