package tema3while;

import java.util.Scanner;

public class Exercise4 {

	//num = 12 --> Es PAR, num = 23 --> Es IMPAR, num = 2 --> Es PAR, num = 0 --> Fin del programa
	//num = -1 --> Es IMPAR, num = -44 --> Es PAR, num = -131254 --> Es PAR, num = 0 --> Fin del programa
	//num = 0 --> Fin del programa
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num; //Variable to store the numbers introduced by the user
		
		Scanner sc = new Scanner(System.in); //Scanner is started
		
		//First instruction to ask for numbers and how to finish it
		System.out.println("Introduzca números para comprobar si son par o impar (Finaliza al introducir [0]):");
		num = sc.nextInt();
		
		//this loop will be working until the user enters [0], it will say if its even or odd,
		//then, it will ask for another and start again
		while (num != 0) {
			
			if (num % 2 == 0) {
				
				System.out.println("Es PAR");
				
			} else {
				
				System.out.println("Es IMPAR");
				
			}
				
			num = sc.nextInt();
			
		}
		
		System.out.println("Fin del programa"); //final message with the result
		
		sc.close(); //Scanner is closed
		
	}

}
