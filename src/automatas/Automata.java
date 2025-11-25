package automatas;

import java.util.Scanner;

public class Automata {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		char respuesta;
		
		do {
			int estado = 0;
			String lexema = "";
			boolean aceptacion = false;

			System.out.print("Ingresa la cadena a evaluar: ");
			String cadena = leer.nextLine() + " ";
			cadena = cadena.toLowerCase();
			
			for (char letra : cadena.toCharArray()) {
				aceptacion = false;
				
				if (letra != 'a' && letra != 'b' && letra != 'c' && letra != ' ' ) {
					System.out.println("Caracter invalido");
					break;
				}
				
				switch (estado) {
				case 0:
					if (letra == 'a') {
						estado = 1;
						lexema += letra;
					} else if (letra == 'b') {
						estado = 7;
						lexema += letra;
					} else if (letra == 'c') {
						lexema += letra;
					} 
					break;
					
				case 1:
					if (letra == 'a') {
						estado = 2;
						lexema += letra;
					} else if (letra == 'b') {
						estado = 3;
						lexema += letra;
					} else if (letra == 'c') {
						lexema += letra;
					}
					break;
					
				case 2:
					if (letra == 'a') {
						estado = 1;
						lexema += letra;
					} else if (letra == 'b') {
						estado = 4;
						lexema += letra;
					} else if (letra == 'c') {
						lexema += letra;
					}
					break;
					
				case 3:
					if (letra == 'a') {
						estado = 4;
						lexema += letra;
					} else if (letra == 'b') {
						estado = 5;
						lexema += letra;
					} else if (letra == 'c') {
						lexema += letra;
					} 
					break;
					
				case 4: 
					if (letra == 'a') {
						estado = 3;
						lexema += letra;
					} else if (letra == 'b') {
						estado = 6;
						lexema += letra;
					} else if (letra == 'c') {
						lexema += letra;
					} 
					break;
					
				case 5:
					if (letra == 'a') {
						estado = 6;
						lexema += letra;
					} else if (letra == 'b') {
						estado = 3;
						lexema += letra;
					} else if (letra == 'c') {
						lexema += letra;
					} 
					break;
					
				case 6:
					aceptacion = true;
					if (letra == 'a') {
						estado = 5;
						lexema += letra;
					} else if (letra == 'b') {
						estado = 11;
						lexema += letra;
					} else if (letra == 'c') {
						lexema += letra;
					} else if (letra == ' ') {
						
					} 
					break;
					
				case 7:
					if(letra == 'b') {
						estado = 8;
						lexema += letra;
					} else if (letra == 'a') {
						estado = 9;
						lexema += letra;
					} else if (letra == 'c') {
						lexema += letra;
					}
					break;
					
				case 8:
					if (letra == 'b') {
						estado = 7;
						lexema += letra;
					} else if (letra == 'a') {
						estado = 10;
						lexema += letra;
					} else if (letra == 'c') {
						lexema += letra;
					} 
					break;
				case 9:
					if (letra == 'b') {
						estado = 10;
						lexema += letra;
					} else if (letra == 'a') {
						estado = 11;
						lexema += letra;
					} else if (letra == 'c') {
						lexema += letra;
					} 
					break;
				case 10:
					if (letra == 'b') {
						estado = 9;
						lexema += letra;
					} else if (letra == 'a') {
						estado = 6;
						lexema += letra;
					} else if (letra == 'c') {
						lexema += letra;
					} 
					break;
				case 11:
					if (letra == 'b') {
						estado = 6;
						lexema += letra;
					} else if (letra == 'a') {
						estado = 9;
						lexema += letra;
					} else if (letra == 'c') {
						lexema += letra;
					}
					break;	
				}
			}
			
			if (aceptacion)
				System.out.print(lexema + " Cadena valida" + "\n");
			else
				System.out.print(lexema + " Cadena no valida" + "\n");
			
			
			System.out.print("¿Deseas evaluar otra cadena? (s/n): ");
			respuesta = leer.next().charAt(0);
			
			leer.nextLine(); 
			System.out.println();
		
		} while(respuesta == 's' || respuesta == 'S');
		
		System.out.println("Programa finalizado.");
		leer.close();
	}
}