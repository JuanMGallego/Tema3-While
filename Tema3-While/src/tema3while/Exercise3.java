package tema3while;

import java.util.Scanner;

public class Exercise3 {

	//num = 2, 3, 4, 5, 6, -1 --> La media de todos los números es: 4.0
	//num = 0, -1 --> La media de todos los números es: 0.0
	//num = 12, 123, 2 --> La media de todos los números es: 45.0
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num; //Variable to store the number introduced by the user
		double suma = 0; //Variable used to add the numbers
		double count = 0; //Variable used to count the numbers
		double average; //Variable used to store the average of the numbers introduced by the user
		
		Scanner sc = new Scanner(System.in); //Scanner is started
		
		//First instruction to ask for numbers and how to finish it
		System.out.println("Introduzca números para hayar la media (Finaliza al introducir uno negativo)");
		num = sc.nextInt();
		
		//while the user is introducing numbers, the program will add them to the variable "suma"
		//and it will add one to the variable "count",
		//but if the user introduces a negative number, it will stop the loop
		while (num >= 0) {
			
			suma += num;
			num = sc.nextInt();
			count ++;
			
		}
		
		average = (double) (suma / count); //the average of the number is calculated
		
		System.out.println("La media de todos los números es: " + average); //Final message with the result
		
		sc.close(); //Scanner is closed
		
	}

}
