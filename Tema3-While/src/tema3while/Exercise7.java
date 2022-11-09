package tema3while;

import java.util.Scanner;

public class Exercise7 {

	//numUser = 354 --> RECORDATORIO: El número que debes adivinar está comprendido entre 1 y 100
	//numUser = 34 --> El número secreto es MENOR al introducido
	//numUser = 12 --> El número secreto es MENOR al introducido
	//numUser = 3 --> El número secreto es MAYOR al introducido
	//numUser = 5 --> ¡CORRECTO! El número era: 5
	
	//numUser = 3 --> El número secreto es MAYOR al introducido
	//numUser = 6 --> El número secreto es MAYOR al introducido
	//numUser = 14 --> El número secreto es MAYOR al introducido
	//numUser = -1 --> Te has rendido :C El número era: 66
	
	public static void main(String[] args) {
	
		int numUser = 0; //Variable used to let the user introduce a number
		int numGen; //Variable used to store the number generated randomly
		
		Scanner sc = new Scanner(System.in); //Scanner is started
		
		//title and instructions
		System.out.println("INTENTA ADIVINAR UN NÚMERO ALEATORIO ENTRE 1 - 100");
		System.out.println("--------------------------------------------------");
		System.out.println();
		System.out.println("Nota: introduce [-1] para rendirte");
		System.out.println();
		
		//number generated randomly
		numGen =(int) (Math.random()*100);
		
		//the program will ask for a number until the user introduces the same as the generated one
		while (numUser != numGen) {
			
			//Asks for a number
			System.out.print("Introduzca un número: ");
			numUser = sc.nextInt();
			
			//Possible errors if the user introduces a number in a different range
			if (numUser < -1 || numUser == 0 || numUser > 100) {
				
				System.out.println("RECORDATORIO: El número que debes adivinar está comprendido entre 1 y 100");
			
			//if not, the user introduces [-1] the program finishes with the solution
			} else if (numUser == -1) {
				
				System.out.println();
				System.out.println("Te has rendido :C");
				numUser = numGen;
			
			//if not, the number introduced is the same, it finishes with the solution
			} else if (numUser == numGen) {
				
				System.out.println();
				System.out.println("¡CORRECTO!");
				
			//if not, it will check if the number introduced is less than the generated one and it will say it
			} else if (numUser < numGen) {
				
				System.out.println("El número secreto es MAYOR al introducido");
			
			//if not, it will do the same but if its larger	
			} else {
				
				System.out.println("El número secreto es MENOR al introducido");
				
			}
			
		}
		
		System.out.println("El número era: " + numGen); //Solution printed after the loop at the end of the program

		sc.close(); //Scanner is closed
		
	}

}
