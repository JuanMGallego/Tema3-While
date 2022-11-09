package tema3while;

import java.util.Scanner;

public class Exercise1 {

	//num = 2, 3, 4, 6, 10, -1 --> La suma de todos los números es: 30
	//num = 6, 5, 4, 4, 2, 84, 34, 5, -45 --> La suma de todos los números es: 144
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num; //Variable to store the number introduced by the user
		int suma = 0; //Variable used to add the numbers
		
		Scanner sc = new Scanner(System.in); //Scanner is started
		
		//First instruction to ask numbers and how to finish it
		System.out.println("Introduzca números para sumar (Finaliza al introducir uno negativo)");
		num = sc.nextInt();
		
		//while the user is introducing numbers, the program will add them to the variable "suma",
		//but if the user introduces a negative number, it will stop the loop
		while (num >= 0) {
			
			suma += num;
			num = sc.nextInt();
			
		}
		
		System.out.println("La suma de todos los números es: " + suma); //Final message with the result
		
		sc.close(); //Scanner is closed
		
	}

}
