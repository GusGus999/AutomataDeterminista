package automatas;

public class Automata {
	public static void main(String[] args) {
		int estado = 0;
		int indice = 0;
		String lexema = "";
		String cadena = "aabb" + " ";
		boolean aceptacion = false;
		
		for (indice = 0; indice < cadena.length(); indice++) {
			char caracter = cadena.charAt(indice);
			aceptacion = false;
			System.out.println("Indice " + indice);
			System.out.println("Caracter " + caracter);
			System.out.println("Estado " + estado);
			
			if (caracter != 'a' && caracter != 'b' && caracter != 'c' && caracter != ' ' ) {
				System.out.println("Caracter invalido");
				break;
			}
			
			switch (estado) {
			case 0:
				if (caracter == 'a') {
					estado = 1;
					lexema += caracter;
				} else if (caracter == 'b') {
					
				} else if (caracter == 'c') {
					lexema += caracter;
				} else {
					System.out.println("Error lexico");
				}
				break;
				
			case 1:
				if (caracter == 'a') {
					estado = 2;
					lexema += caracter;
				} else if (caracter == 'b') {
					estado = 3;
					lexema += caracter;
				} else if (caracter == 'c') {
					lexema += caracter;
				} else {
					System.out.println("Error lexico");
				}
				break;
				
			case 2:
				if (caracter == 'a') {
					estado = 1;
					lexema += caracter;
				} else if (caracter == 'b') {
					estado = 4;
					lexema += caracter;
				} else if (caracter == 'c') {
					lexema += caracter;
				} else {
					System.out.println("Error lexico");
				}
				break;
				
			case 3:
				if (caracter == 'a') {
					estado = 4;
					lexema += caracter;
				} else if (caracter == 'b') {
					estado = 5;
					lexema += caracter;
				} else if (caracter == 'c') {
					lexema += caracter;
				} else {
					System.out.println("Error lexico");
				}
				break;
				
			case 4: 
				if (caracter == 'a') {
					estado = 3;
					lexema += caracter;
				} else if (caracter == 'b') {
					estado = 6;
					lexema += caracter;
				} else if (caracter == 'c') {
					lexema += caracter;
				} else {
					System.out.println("Error lexico");
				}
				break;
				
			case 5:
				if (caracter == 'a') {
					estado = 6;
					lexema += caracter;
				} else if (caracter == 'b') {
					estado = 3;
					lexema += caracter;
				} else if (caracter == 'c') {
					lexema += caracter;
				} else {
					System.out.println("Error lexico");
				}
				break;
				
			case 6:
				aceptacion = true;
				if (caracter == 'a') {
					
				} else if (caracter == 'b') {
					
				} else if (caracter == 'c') {
					lexema += caracter;
				} else if (caracter == ' ') {
					
				} else {
					System.out.println("Error lexico");
				}
				break;
				
			}
			System.out.print("\n");
			
		}
		
		if (aceptacion) {
			System.out.println(lexema);
			System.out.println("Cadena valida");
		} else {
			System.out.println(lexema);
			System.out.println("Cadena no valida");
		}
		
		
		
	}
}
