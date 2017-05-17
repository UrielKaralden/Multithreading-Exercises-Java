/**
 * Multithreading Exercises - Java
 * List 1 - Exercise 1
 * @title Fixed Type Interest
 * @brief Show the interest of a quantity in a fixed period of 6 months
 * @author Alejandro Munoz Del Alamo
 * @version 1.0 
 * Copyright © 2017 
 */

import java.util.*;

public class fixedTypeInterest
{
	public static void main(String[] args)
	{
		// Using scanner for reading quantity and percentage
		Scanner Keyboard = new Scanner(System.in);

		// Asking for the data we need (quantity and percentage)
		System.out.println("\n\tPlease introduce the quantity you want to analize: \n");
		float quantity = Keyboard.nextFloat();

		System.out.println("\n\tPlease introduce the percentage you want to analize: \n");
		float percentage = Keyboard.nextFloat();

		float period = 180; // 6 month 	→ 180 days aprox.
		float year	 = 365;	// 1 year	→ 365 days aprox. 

		// Now we apply the formula
		// profit = quantity * (percentage * period(days) / year(days))
		float profit = quantity * (percentage * period/year);

		// Once we have the result, we show it.
		System.out.println("\n\tThe profit is " + profit/100 + "\n\n\tHave a nice day. Goodbye.\n");
	}
}