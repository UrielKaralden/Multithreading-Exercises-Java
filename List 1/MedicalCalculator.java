/**
 * Multithreading Exercises - Java
 * List 1 - Exercise 3
 * @title Medical Calculator
 * @brief Medical calculator which uses Cockroft-Gault ecuation and the corporal mass index to show renal and corpulence health
 * @author Alejandro Munoz Del Alamo
 * @version 1.0 
 * Copyright © 2017 
 */

import java.util.*;

public class MedicalCalculator
{
	// In this case, we are going to use 2 methods
	// one for Cockroft-Gault ecuation and another for corporal mass index

	/**
	 * Cockroft_Gault ecuation
	 * @param age : Age of the person we want to analize
	 * @param weight : Weight of the person we want to analize
	 * @param creatinine : Creatinine level of the person we want to analize
	 * @return double : Result of applying the ecuation to the parameters given
	 */
	public static double Cockroft_Gault(int age, double weight, double creatinine, boolean isFemale)
	{
		double result = (140 - age) * (weight) / 72 * creatinine;

		if (isFemale)
			result = result * 0.85;

		return result;
	}

	/**
	 * corporal mass index
	 * @param weight : Weight of the person we want to analize
	 * @param height : Height of the person we want to analize
	 * @return double : Result of applying the ecuation to the parameters given
	 */
	public static double corporal_mass_index(double weight, double height)
	{
		return weight / Math.pow(height,2);
	}

	/**
	 * isUnderOrEqual
	 * @param x : Value we want to use
	 * @param limit : Limit of the range
	 * @return boolean : x is under or equal the limit
	 */
	public static boolean isUnder(double x, double limit)
	{
		return x < limit;
	}

	/**
	 * isAboveOrEqual
	 * @param x : Value we want to use
	 * @param limit : Limit of the range
	 * @return boolean : x is above or equal the limit
	 */
	public static boolean isAboveOrEqual(double x, double limit)
	{
		return x >= limit;
	}

	/**
	 * isAboveOrEqual
	 * @param x : Value we want to use
	 * @param lower : Lower limit of the range
	 * @param upper : Upper limit of the range
	 * @return boolean : x between the limits
	 */	
	public static boolean isBetween(double x, double lower, double upper)
	{
		return (lower <= x && x < upper);
	}

	public static void main(String[] args)
	{
		Scanner Keyboard_Int = new Scanner(System.in);
		Scanner Keyboard_Double = new Scanner(System.in);
		Scanner Keyboard_Boolean = new Scanner(System.in);

		// Program presentation
		System.out.println("\n\tHello and welcome to our Medical Calculator.\n\tThis calculator analizes your renal and corpulence health.\n");
		System.out.println("\n\tPlease introduce your age: \n");

		int age = Keyboard_Int.nextInt();

		System.out.println("\n\tPlease introduce your height(m): \n");

		double height = Keyboard_Double.nextDouble();

		System.out.println("\n\tPlease introduce your weight(kg): \n");

		double weight = Keyboard_Double.nextDouble();

		System.out.println("\n\tPlease introduce your creatinine level: \n");

		double creatinine = Keyboard_Double.nextDouble();

		System.out.println("\n\tPlease tell us if you are a female(true/false): \n");

		boolean isFemale = Keyboard_Boolean.nextBoolean();


		// Once we have all the parameters, we begin to process the data
		double lightening = Cockroft_Gault(age, weight, creatinine, isFemale);
		double cmi = corporal_mass_index(weight, height);

		// Once we pass the processing, we compare our results of Cockroft_Gault ecuation
		if (isUnder(lightening, 15))
			System.out.println("\n\tYou suffer a renal failure\n");
		
		else if (isBetween(lightening, 15, 30))
			System.out.println("\n\tYou suffer a serious renal damage.\n");

		else if (isBetween(lightening, 30, 60))
			System.out.println("\n\tYou suffer a moderate renal damage.\n");

		else if (isBetween(lightening, 60, 90))
			System.out.println("\n\tYou suffer a minor renal damage.\n");

		else if (isAboveOrEqual(lightening, 90))
			System.out.println("\n\tYou have a healthy kidney.\n");


		// The same for corporal mass index
		if (isUnder(cmi, 16))
			System.out.println("\n\tYou suffer a severe thinness.\n");
		
		else if (isBetween(cmi, 16, 17))
			System.out.println("\n\tYou suffer a moderate thinness.\n");

		else if (isBetween(cmi, 17, 18.5))
			System.out.println("\n\tYou have an acceptable thinness.\n");

		else if (isBetween(cmi, 18.5, 25))
			System.out.println("\n\tYou have a healthy weight.\n");

		else if (isBetween(cmi, 25, 30))
			System.out.println("\n\tYou suffer of overweight.\n");

		else if (isBetween(cmi, 30, 35))
			System.out.println("\n\tYou suffer of obesity in first degree.\n");

		else if (isBetween(cmi, 35, 40))
			System.out.println("\n\tYou suffer of obesity in second degree.\n");

		else if (isAboveOrEqual(cmi, 40))
			System.out.println("\n\tYou suffer of obesity in third degree.\n");
	}
}