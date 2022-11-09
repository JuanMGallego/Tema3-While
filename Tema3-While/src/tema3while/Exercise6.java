package tema3while;

import java.util.Scanner;

public class Exercise6 {

	//edad = 12, 3, 20, 21, 9, 8, 10, 18, 19, -1 --> Suma de todas las edades: 120, Media edades: 13.333333333333334, Número total de alumnos: 9, Mayores de edad: 4
	//edad = 5, 5, 5, 5, 5, 5, 5, -1 --> Suma de todas las edades: 35, Media edades: 5.0, Número total de alumnos: 7, Mayores de edad: 0
	//edad = 18, 4, 18, 4, 18, 4, 18, 4, -1231234 --> Suma de todas las edades: 88, Media edades: 11.0, Número total de alumnos: 8, Mayores de edad: 4
	
	public static void main(String[] args) {

		int edad; //Variable used to introduce ages by the user
		int count = 0; //Variable used to count each time user enters an age
		int over = 0; //Variable used to store those that are over 18
		int suma = 0; //Variable used to add each age
		double average; //Variable used to store the average operation
		
		Scanner sc = new Scanner(System.in); //Scanner is started
		
		//It asks for the first age and opens a space to introduce it
		System.out.println("Introduzca edades de alumnos (Finaliza al introducir uno negativo): ");
		edad = sc.nextInt();
		
		//Condition to be asking until the user enters a negative number
		while (edad >= 0) {
			
			suma += edad; //adds the age to the total
			count ++; //adds one to the counter
			
			//condition to add one to the counter of ages over 18
			if (edad >= 18) {
				
				over ++;
				
			}
			
			edad = sc.nextInt(); //final space to introduce another age
			
		}
		
		average = suma / count; //average of all the ages introduced after the loop finishes
		
		//final results printed in order
		System.out.println();
		System.out.println("Suma de todas las edades: " + suma);
		System.out.println("Media edades: " + average);
		System.out.println("Número total de alumnos: " + count);
		System.out.println("Mayores de edad: " + over);
		
		sc.close(); //Scanner is closed
		
	}

}
