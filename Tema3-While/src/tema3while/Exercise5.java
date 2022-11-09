package tema3while;

import java.util.Scanner;

public class Exercise5 {
	
	//num = 2, 3, 12, 0, -23, 2345, -2, 9, 0, -1 --> Suma números positivos: 2371.0, Media números negativos: -8.666666666666666, Cantidad de ceros: 2
	//num = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 --> Suma números positivos: 10.0, Media números negativos: NaN, Cantidad de ceros: 0
	//num = -1, -23, -2, -546, -2, -3, -5, -12, -4, -98 --> Suma números positivos: 0.0, Media números negativos: -69.6, Cantidad de ceros: 0
	//num = 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 --> Suma números positivos: 0.0, Media números negativos: NaN, Cantidad de ceros: 10
	
	public static void main(String[] args) {
		
		int num; //Variable used to store the number introduced by the user
		int count = 0; //Variable used to count total number user introduced
		int negCount = 0; //Variable used to count the negative numbers user introduced
		int cero = 0; //Variable used to count the positive numbers user introduced
		double posSuma = 0; //Variable used to store the sum of positive numbers
		double negSuma = 0; //Variable used to store the sum of negative numbers
		double negAverage; //Variable used to store the average of negative numbers calculated
		
		Scanner sc = new Scanner(System.in); //Scanner is started
		
		System.out.println("Introduzca 10 números: "); //Printed line to ask the user for 10 numbers
		
		//while the total number the user has introduced is different than 10, the loop will be executing 
		
		while (count != 10) {
			
			num = sc.nextInt(); //Space to let the user introduce another number
			
			//if the number is positive, it will add it to the variable
			if (num > 0) {
				
				posSuma += num;
				
			//if the number is negative , it will add it to the variable and it will add one to count the negative numbers introduced
			} else if (num < 0) {
				
				negSuma += num;
				negCount++;
				
			//but else, if its 0, it will count it	
			} else {
				
				cero++;
				
			}
			
			count++; //it will add one to know the numbers entered by the user
			
		}
		
		negAverage = negSuma / negCount; //average of negative numbers 
		
		//Final result printed to the user
		
		System.out.println();
		System.out.println("Suma números positivos: " + posSuma);
		System.out.println("Media números negativos: " + negAverage);
		System.out.println("Cantidad de ceros: " + cero);
		
		sc.close(); //Scanner is closed
	}
	
}
