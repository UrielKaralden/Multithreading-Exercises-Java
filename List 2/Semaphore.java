/**
 * Multithreading Exercises - Java
 * List 2 - Exercise 1
 * @title Semaphore
 * @brief Abstraction of a semaphore
 * @author Alejandro Munoz Del Alamo
 * @version 1.0 
 * Copyright © 2017 
 */

public class Semaphore
{
	public enum Color {Rojo, Verde, Ambar}
	Color encendido = Color.Rojo;

	//public Semaphore(){this.encendido = Rojo;}
	public void cambiar(Color c) {this.encendido = c;}
	public Color mostrar(){return encendido;}
}