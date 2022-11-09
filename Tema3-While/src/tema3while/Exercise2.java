package tema3while;

import java.util.Scanner;

public class Exercise2 {

	//num = 2, 3, 3, 4, 5, 23, 4, 3, -1 --> Ha introducido un total de 8 números (sin contar el negativo)
	//num = -1 --> Ha introducido un total de 0 números (sin contar el negativo)
	//num = 1423, 12345, --> Ha introducido un total de 2 números (sin contar el negativo)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num; //Variable to store the number introduced by the user
		int count = 0; //Variable used to count the numbers
		
		Scanner sc = new Scanner(System.in); //Scanner is started
		
		//First instruction to ask numbers and how to finish it
		System.out.println("Introduzca números para contar (Finaliza al introducir uno negativo)");
		num = sc.nextInt();
		
		//while the user is introducing numbers, the program will add one to the variable "count",
		//but if the user introduces a negative number, it will stop the lootp
		while (num >= 0) {
			
			count ++;
			num = sc.nextInt();
			
		}
		
		//Final message with the result
		System.out.println("Ha introducido un total de " + count + " números (sin contar el negativo)");
		
		sc.close(); //Scanner is closed
		
	}

}
