/**
 * Multithreading Exercises - Java
 * List 2 - Exercise 1
 * @title UseOfSemaphore
 * @brief Test program of Semaphore
 * @author Alejandro Munoz Del Alamo
 * @version 1.0 
 * Copyright © 2017 
 */

public class UseOfSemaphore
{
	public static void main(String[] args)
	{
		Semaphore s = new Semaphore();
		System.out.println(s.mostrar());
		s.cambiar(Semaphore.Color.Ambar);
		System.out.println(s.mostrar());
	}
}