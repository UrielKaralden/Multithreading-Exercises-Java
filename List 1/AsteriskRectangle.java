/**
 * Multithreading Exercises - Java
 * List 1 - Exercise 2
 * @title Asterisk Rectangle
 * @brief Show an rectangle formed by asterisks. Dimensions given by console
 * @author Alejandro Munoz Del Alamo
 * @version 1.0 
 * Copyright © 2017 
 */

import java.util.*;

public class AsteriskRectangle
{
	public static void main(String[] args)
	{
		// Using scanner for reading quantity and percentage
		Scanner Keyboard = new Scanner(System.in);

		// Asking for the data we need (height and width)
		System.out.println("\n\tPlease introduce the height of the rectangle: \n");
		int height = Keyboard.nextInt();

		System.out.println("\n\tPlease introduce the width of the rectangle: \n");
		int width = Keyboard.nextInt();

		// Now we show our rectangle
		String border = ""; 
		String middle = "";

		for(int w = 0; w < width; ++w)
		{
			border = border + "*";
			if (w == 0 || w == (width -1))
				middle = middle + "*";
			else
				middle = middle + " ";
		}


		System.out.println("\n\n\tResult :\n\n\t" + border);

		for (int h = 0; h < (height - 3); ++h)
			System.out.println("\t" + middle);

		System.out.println("\t" + border + "\n\n\tHave a nice day. Goodbye.\n");
	}
}