package tema3while;

import java.util.Scanner;

public class Exercise8 {
	
	//tree = -1 --> ERROR: No ha introducido la altura de ningún arbol
	//tree = 4, -1 --> El arbol más alto mide 4cm
	//tree = 12, -4, -1 --> NOTA: Los valores no serán contabilizados, El arbol más alto mide 12cm
	//tree = -56, -123, -1 --> NOTA: Los valores negativos no serán contabilizados, NOTA: Los valores negativos no serán contabilizados, ERROR: No ha introducido la altura de ningún arbol
	//tree = -4, 89, -5, -1 --> NOTA: Los valores negativos no serán contabilizados, El arbol más alto mide 89cm
	//tree = 0, -1 --> El arbol más alto mide 0cm
	
	public static void main(String[] args) {

		int tree; //Variable used to store the height of a tree introduced by the user
		int maxHeight = 0; //Variable used to store the biggest height stored
		int count = 0; //Variable used to count the times the user has introduced a height
		
		Scanner sc = new Scanner(System.in); //Scanner is started
		
		//title and instructions
		System.out.println("PROGRAMA PARA ELEGIR EL ARBOL MÁS ALTO");
		System.out.println("-------------------------------------------------------");
		System.out.println();
		System.out.println("Notas:");
		System.out.println("La altura tiene que estar en centímetros");
		System.out.println("Introduce [-1] para finalizar");
		System.out.println();
		
		//First time program asks for the height before the loop
		System.out.print("Introduce la altura de un arbol: ");
		tree = sc.nextInt();
		System.out.println();

		//While used to repeat this action until the user stops it introducing [-1]
		while (tree != -1) {
			
			//if the height introduced is bigger than the last one and if its positive, it overwrites the variable with this one
			if (tree > maxHeight && tree >= 0) {
				
				maxHeight = tree;
				
			}
			
			//if the user introduces a negative height it will do an annotation
			if (tree < -1) {
				
				System.out.println("NOTA: Los valores negativos no serán contabilizados");
				System.out.println();
				
			} else {
				
				count++; //It adds one to the counter of times
				
			}
			
			//Program asks for the height
			System.out.print("Introduce la altura de un arbol: ");
			tree = sc.nextInt();
			System.out.println();
			
		}
		
		//if the loop never takes place, the program will only print an error
		if (count == 0) {
			
			System.out.println("ERROR: No ha introducido la altura de ningún arbol");
			
		//but if it takes place n times, it gives the solution
		} else {
			
			System.out.println("El arbol más alto mide " + maxHeight + "cm");
			
		}
		
		sc.close(); //Scanner is closed
		
	}

}
